#include "PQueue.hpp"

PQueue::PQueue(int cap) { //constructor
	heap = new int[cap]; //ũ�Ⱑ cap�� �迭�� �����ϰ� heap�� ����
	capacity = cap; //capacity�� cap ����
	size = 0; //size�� 0���� �ʱ�ȭ
}

PQueue::~PQueue() { //destructor
	delete[] heap;
}

void PQueue::insert(int data) {
	int index = size; //���� �迭���� ���� �������� ä�����ִ� ĭ�� ���� ĭ�� index�� ����
	int parent = (index + 1) / 2 - 1; //0��°���� ä�� ���� �����ϰ� �θ� ��� �ε����� ���ϱ�
	heap[index] = data; //data�� �迭�� ����

	while(parent >= 0) { //�θ����� �ε��� ���� 0���� �۾��� ������ ���簪�� �θ� �� 
		if (heap[index] > heap[parent]) //���� index�� ������ �θ� ����� ���� �� ������ ��ġ�� �ٲٱ�
			swap(heap, index, parent);
		else
			break; //���� index ���� �θ����� ������ ������ �ݺ��� ���߱�
		index = parent; // �θ� ���� �� �ٲ� ����, �� ���� �θ�� �ٽ� ���ϱ� ���� index�� parent�� ������Ʈ
		parent = (index + 1) / 2 - 1;
	}
	size++; //size �� 1 ����
}

void PQueue::removeData(int data) {
	int index = find(data); //data�� �迭�� ���°�� ����ִ��� Ȯ��
	
	if (index != -1) { //������ find���� �� ã�����ϴ� ���� �迭�� ���� ��� -1�� �Ǳ� ������ index�� -1���� Ȯ��
		heap[index] = heap[size - 1]; //data�� �ִ� �ڸ��� �Ǹ����� ���Ҹ� �ֱ�
		down(heap, index, size); //���� data�� �ִ� �ڸ��� ���� �� ���ҿ� ���� �ڽĵ��� ���ϸ鼭 �ùٸ� ��ġ�� �̵�
		size--; // size �� 1 ����
	}
}

int PQueue::find(int data) {
	int index = -1;
	for (int i = 0; i < size; i++) { //for���� �̿��Ͽ� data�� ����ִ� index�� ���ϱ�
		if (data == heap[i])
			index = i;
	}
	//�迭�� ���� ���� ���� �� ������ ���� index�� ����ǵ��� ��
	//ã���� �ϴ� ���� �迭�� ���� ���� -1
	return index;
}

void PQueue::display() {
	for(int i = 0; i < size; i++)
		cout << heap[i] << " ";

	cout << endl;

}

void PQueue::heapSort() {
	int index = size - 1; //���� ä�����ִ� ���� ������ �ε���
	for (int i = 0; i < size - 1; i++) { //(���� �迭�� ����ִ� ���� ���� - 1)����ŭ �Ʒ� ������ �ݺ�
		swap(heap, 0, index); //�迭�� �޺κп� heapsort�� ����� �����ϱ� ���� 0��° ���� index���� ��ġ �ٲٱ�
		down(heap, 0, index); //0��° ���� �ڽĵ�� ���ϸ鼭 �ùٸ� ��ġ�� �̵�
		index--; //���������� heapsort�� �ϱ����� index�� ����
	}

}

void PQueue::swap(int* heap, int n1, int n2) { //n1��° ���� n2��° ���� ��ġ�� �ٲٴ� �Լ� (���� �߰��� �Լ�)
	int temp = heap[n1];
	heap[n1] = heap[n2];
	heap[n2] = temp;
}

void PQueue::down(int* heap, int index, int size) { //index�� �ִ� ���� size��°������ �ڽĳ��� ���Ͽ� �ڽĺ��� ���� ũ�� ��ġ �ٲٴ� �Լ� (���� �߰��� �Լ�) 
	int left = 2 * index + 1; //���� ������ �ڽ��� �ε���
	int right = 2 * index + 2;

	while (left < size) { //�ڽ��� �ִ��� Ȯ��
		//���ʿ����� �ڽ� ���� ���� ���� �������� ������ ���Ƿ� ����

		if (heap[index] < heap[left] && (heap[left] >= heap[right] || right >= size)) { //���� �ڽ��� ���� ������ ũ��, �� �� ���� �ڽ��� ������ �ڽĺ��� ũ�ų� ������ �ڽ��� �ε����� size���� ū ���(-> ������ �ڽ��� ���� ���� �ڽĸ� ���� ���� ���� ����)
			swap(heap, index, left); //���� ���� ���� �ڽ� �� �ٲٱ�
			index = left;
		}
		else if (right < size && heap[index] < heap[right] && heap[left] < heap[right]) { //������ �ڽ��� �����ϰ� (�ε������� size�� ��), ������ �ڽ��� ���� ���� ���� �ڽĺ��� ū ���
			swap(heap, index, right); //���� ���� ������ �ڽ� �� �ٲٱ�
			index = right;
		}
		else //���� �� ��쿡 �ش���� ������ �ݺ��� ���߱�
			break;

		// ���ο� index���� ���� left�� right�� ������Ʈ
		left = 2 * index + 1;
		right = 2 * index + 2;
	}
}