#include "PQueue.hpp"

int main() {
	PQueue pqueue(20);
	pqueue.insert(45);
	pqueue.insert(20);
	pqueue.insert(14);
	pqueue.insert(12);
	pqueue.insert(31);
	pqueue.insert(7);
	pqueue.insert(11);
	pqueue.insert(13);
	pqueue.insert(7);

	pqueue.display(); //45 31 14 13 20 7 11 12 7
	pqueue.removeData(45);
	pqueue.display(); //31 20 14 13 7 7 11 12
	cout << pqueue.find(12) << endl; //7
	pqueue.heapSort();
	pqueue.display(); //7 7 11 12 13 14 20 31

	return 0;
}
