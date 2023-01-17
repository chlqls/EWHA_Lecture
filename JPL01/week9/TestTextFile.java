//예제1

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "test.txt";
		PrintWriter outStream = null;
		String line;
		
		try {
			outStream = new PrintWriter(fileName);
		}
		catch(IOException e) {
			System.out.println("Exception occurs.");
			System.exit(1);
		}
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Input three lines");
		
		for(int i = 0; i < 3; i++) {
			line = kbd.nextLine();
			outStream.println(line);
		}
		outStream.close();
	}

}
