//예제4
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		
		try {
			System.out.println("Enter number of donuts : ");
			int donutCount = kbd.nextInt();
			
			System.out.println("Enter number of glasses of milk : ");
			int milkCount = kbd.nextInt();
			
			if(milkCount < 1)
				throw new Exception("Ecxeption: No milk!");
			
			double donutsPerGlass = donutCount / (double)milkCount;
			
			System.out.println(donutCount + " donuts.");
			System.out.println(milkCount + " glasses of milk.");
			System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Go buy some milk");
		}
		System.out.println("End of program.");
	}

}
