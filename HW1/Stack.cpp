#include "Stack.hpp"

template<typename T>
Stack<T>::Stack() {// constructor
	topNode = nullptr;
}

template<typename T>
Stack<T>::~Stack() {// destructor
	clear();
}

template<typename T>
void Stack<T>::push(T data) {// push
	Node* v = new Node;
	v->data = data;
	v->next = topNode;
	topNode = v;
}

template<typename T>
void Stack<T>::pop() {// pop
	if (isEmpty())
		cout << ("Stack is empty") << endl;
	else
	{
		Node* old = topNode;
		topNode = old->next;
		delete old; //free(old);?
	}
}

template<typename T>
T Stack<T>::top() {// return top data
	if (isEmpty()) {
		cout << ("Stack is empty") << endl;
		return NULL;
	}
	return topNode->data;
}

template<typename T>
bool Stack<T>::isEmpty() {// return 1 if empty
	if (topNode == nullptr)
		return true;
	else
		return false;
}

template<typename T>
int Stack<T>::size() {// return size of the stack
	int n = 0;
	Node* temp = topNode;

	while (temp != nullptr) {
		temp = temp->next;
		n++;
	}
	return n;
}

template<typename T>
void Stack<T>::clear() {// clear the stack
	while (!isEmpty())
		pop();
}

template<typename T>
void Stack<T>::printStack() {// print all elements in the stack
	if (isEmpty())
		cout << ("Stack is empty") << endl;
	else
	{
		Node* temp = topNode;
		while (temp != nullptr) {
			cout << temp->data << " ";
			temp = temp->next;
		}
		cout << endl;
	}
}
