//예제6

import java.util.LinkedList;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> myStack = new LinkedList<Integer>(); //LinkedList
		
		Scanner kbd = new Scanner(System.in);
		int num1;
		
		while(true) {
			System.out.print("push numbers(0 to quit): ");
			num1 = kbd.nextInt();
			
			if(num1 == 0) break;
			myStack.addLast(new Integer(num1)); // addLst(), Integer 
//			myStack.addLast(num1); // 그냥 괄호 안에 num1만 써도 됨
		}
		
		System.out.println("<Popped Result>");
		while(!myStack.isEmpty()) { //isEmpty()
			int num2 = myStack.removeLast(); //removeLast()
			System.out.println(num2);
		}
	}

}
