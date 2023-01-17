#include "PQueue.hpp"

PQueue::PQueue(int cap) { //constructor
	heap = new int[cap]; //크기가 cap인 배열을 생성하고 heap에 연결
	capacity = cap; //capacity에 cap 대입
	size = 0; //size는 0으로 초기화
}

PQueue::~PQueue() { //destructor
	delete[] heap;
}

void PQueue::insert(int data) {
	int index = size; //현재 배열에서 가장 마지막에 채워져있는 칸의 다음 칸을 index에 저장
	int parent = (index + 1) / 2 - 1; //0번째부터 채운 것을 감안하고 부모 노드 인덱스값 구하기
	heap[index] = data; //data를 배열에 저장

	while(parent >= 0) { //부모노드의 인덱스 값이 0보다 작아질 때까지 현재값과 부모값 비교 
		if (heap[index] > heap[parent]) //현재 index의 값보다 부모 노드의 값이 더 작으면 위치를 바꾸기
			swap(heap, index, parent);
		else
			break; //현재 index 값이 부모노드의 값보다 작으면 반복문 멈추기
		index = parent; // 부모 노드와 값 바꾼 다음, 더 위의 부모와 다시 비교하기 위해 index와 parent값 업데이트
		parent = (index + 1) / 2 - 1;
	}
	size++; //size 값 1 증가
}

void PQueue::removeData(int data) {
	int index = find(data); //data가 배열의 몇번째에 들어있는지 확인
	
	if (index != -1) { //위에서 find했을 때 찾고자하는 수가 배열에 없는 경우 -1이 되기 때문에 index값 -1인지 확인
		heap[index] = heap[size - 1]; //data가 있던 자리에 맨마지막 원소를 넣기
		down(heap, index, size); //원래 data가 있던 자리에 새로 들어간 원소와 그의 자식들을 비교하면서 올바른 위치로 이동
		size--; // size 값 1 감소
	}
}

int PQueue::find(int data) {
	int index = -1;
	for (int i = 0; i < size; i++) { //for문을 이용하여 data가 들어있는 index값 구하기
		if (data == heap[i])
			index = i;
	}
	//배열에 같은 수가 있을 때 마지막 수의 index가 저장되도록 함
	//찾고자 하는 수가 배열에 없을 떄는 -1
	return index;
}

void PQueue::display() {
	for(int i = 0; i < size; i++)
		cout << heap[i] << " ";

	cout << endl;

}

void PQueue::heapSort() {
	int index = size - 1; //현재 채워져있는 가장 마지막 인덱스
	for (int i = 0; i < size - 1; i++) { //(현재 배열에 들어있는 값의 개수 - 1)번만큼 아래 수행을 반복
		swap(heap, 0, index); //배열의 뒷부분에 heapsort된 결과를 저장하기 위해 0번째 값과 index값의 위치 바꾸기
		down(heap, 0, index); //0번째 값을 자식들과 비교하면서 올바른 위치로 이동
		index--; //연속적으로 heapsort를 하기위해 index값 감소
	}

}

void PQueue::swap(int* heap, int n1, int n2) { //n1번째 값과 n2번째 값의 위치를 바꾸는 함수 (새로 추가한 함수)
	int temp = heap[n1];
	heap[n1] = heap[n2];
	heap[n2] = temp;
}

void PQueue::down(int* heap, int index, int size) { //index에 있는 값을 size번째까지의 자식노드와 비교하여 자식보다 값이 크면 위치 바꾸는 함수 (새로 추가한 함수) 
	int left = 2 * index + 1; //왼쪽 오른쪽 자식의 인덱스
	int right = 2 * index + 2;

	while (left < size) { //자식이 있는지 확인
		//왼쪽오른쪽 자식 숫자 같을 때는 왼쪽으로 가도록 임의로 설정

		if (heap[index] < heap[left] && (heap[left] >= heap[right] || right >= size)) { //왼쪽 자식이 현재 값보다 크고, 이 때 왼쪽 자식이 오른쪽 자식보다 크거나 오른쪽 자식의 인덱스가 size보다 큰 경우(-> 오른쪽 자식은 없고 왼쪽 자식만 있을 때를 위한 조건)
			swap(heap, index, left); //현재 값과 왼쪽 자식 값 바꾸기
			index = left;
		}
		else if (right < size && heap[index] < heap[right] && heap[left] < heap[right]) { //오른쪽 자식이 존재하고 (인덱스값을 size와 비교), 오른쪽 자식이 현재 값과 왼쪽 자식보다 큰 경우
			swap(heap, index, right); //현재 값과 오른쪽 자식 값 바꾸기
			index = right;
		}
		else //위의 두 경우에 해당되지 않으면 반복문 멈추기
			break;

		// 새로운 index값에 따라 left와 right도 업데이트
		left = 2 * index + 1;
		right = 2 * index + 2;
	}
}