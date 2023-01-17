#include "Queue.hpp"

template<typename T>
Queue<T>::Queue(int size) {// constructor
	queue = new T[size];
	queue_size = size;
	front_p = 0;
	rear_p = -1;
}

template<typename T>
Queue<T>::~Queue() {// destructor
	clear();
	delete[] queue;
}

template<typename T>
void Queue<T>::enqueue(T data) {// enqueue
	if (isFull())
		cout << ("Queue is full") << endl;
	else
	{
		rear_p = (rear_p + 1) % queue_size;
		queue[rear_p] = data;
	}
}

template<typename T>
void Queue<T>::dequeue() {// dequeue
	if (isEmpty())
		cout << ("Queue is empty") << endl;
	else
	{
		front_p = (front_p + 1) % queue_size;

		if (front_p == (rear_p + 1) % queue_size)
			front_p = -1;
	}
}

template<typename T>
T Queue<T>::front() {// return front data
	if (isEmpty())
	{
		cout << ("Queue is empty") << endl;
		return 0; //queue가 empty일 때 어떤 값을 return 해야할지 몰라서 0을 했는데 main.cpp에서 front를 출력하면 "Queue is empty"와 0이 같이 출력되는 문제가 있었습니다.(해결못함)
	}
	else
		return queue[front_p];
}

template<typename T>
bool Queue<T>::isEmpty() {// return 1 if empty
	if (size() == 0)
		return true;
	else {
		//		if (front_p == -1)
		//			front_p = (rear_p + 1) % queue_size;
		return false;
	}
}

template<typename T>
bool Queue<T>::isFull() {// return 1 if full
	if (size() == queue_size)
		return true;
	else {
		if (front_p == -1)
			front_p = (rear_p + 1) % queue_size;
		return false;
	}
}

template<typename T>
int Queue<T>::size() {// return size of the queue
	if (rear_p == -1)
		return 0;
	else if (front_p == -1)
		return 0;
	else if (front_p <= rear_p)
		return (rear_p - front_p + 1);
	else
		return (queue_size - front_p + rear_p + 1);
}

template<typename T>
void Queue<T>::clear() {// clear the queue
	while (!isEmpty())
		dequeue();
}

template<typename T>
void Queue<T>::printQueue() {// print all elements in the queue
	if (isEmpty())
		cout << ("Queue is empty") << endl;
	else
	{
		if (front_p == rear_p)
			cout << queue[front_p];
		else if (front_p < rear_p)
			for (int i = front_p; i <= rear_p; i++)
				cout << queue[i] << " ";
		else
		{
			for (int i = front_p; i < queue_size; i++)
				cout << queue[i] << " ";
			for (int i = 0; i <= rear_p; i++)
				cout << queue[i] << " ";
		}
		cout << endl;
	}
}
