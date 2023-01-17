//예제7

import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myQueue = new LinkedList<String>(); //LinkedList
		Scanner kbd = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("Input a name to queue in('O' to quit):");
			name = kbd.next();
			
			if(name.equalsIgnoreCase("O")) break;
			myQueue.offer(name); //offer()
		}
		
		System.out.println("<Result>");
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll()); //poll()
		}
	}

}
