#include "Stack.cpp"
#include "Queue.cpp"

int main() {
	Stack<int> stack;
	for (int i = 0; i < 10; i++) {
		stack.push(i);
	}

	while (stack.size() != 3) {
		cout << stack.top() << " "; //9 8 7 6 5 4 3
		stack.pop();
	}
	cout << endl;

	stack.printStack(); //2 1 0
	cout << "empty? " << stack.isEmpty() << endl; //empty? 0 false

	stack.clear();
	cout << "size: " << stack.size() << endl; //size: 0

	stack.printStack(); //Stack is empty
	stack.pop(); //Stack is empty
	stack.top(); //Stack is empty

	Queue<char> queue(10);
	char hw[11] = { 'h','e','l','l','o','w','o','r','l','d', '!' };
	for (int i = 0; i < 10; i++) {
		queue.enqueue(hw[i]);
	}
	queue.printQueue(); //h e l l o w o r l d
	cout << "full? " << queue.isFull() << endl; //full? 1

	while (queue.size() != 5) {
		cout << queue.front() << " "; //h e l l o
		queue.dequeue();
	}
	cout << endl;

	for (int i = 0; i < 6; i++) {
		queue.enqueue(hw[i]); //Queue is full
	}

	queue.dequeue();
	cout << "full? " << queue.isFull() << endl; //full? 0

	queue.clear();
	cout << "empty? " << queue.isEmpty() << endl; //empty? 1

	queue.dequeue(); //Queue is empty
	queue.printQueue(); //Queue is empty
	queue.front(); //Queue is empty
	return 0;
}
