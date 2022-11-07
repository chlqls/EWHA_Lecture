//예제5

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		System.out.println("Input two integers");
		int n1, n2, n3;
		n1 = kbd.nextInt();
		n2 = kbd.nextInt();
		
		try {
			n3 = n1/n2;
			System.out.println("n1/n2 = " + n3);
		}
		catch(Exception e) {
			System.out.println("Don't divide a number with zero!!!");
		}
	}

}
