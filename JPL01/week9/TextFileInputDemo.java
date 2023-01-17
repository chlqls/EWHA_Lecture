//예제2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter file name: ");
		Scanner kbd = new Scanner(System.in);
		String fileName = kbd.next();
		Scanner inputStream = null;
		System.out.println("The file " + fileName + "\n" + "contains the following lines:\n");
		
		try {
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	}

}
