import java.util.Scanner;

//예제6

public class TwoCatchesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner kbd = new Scanner(System.in);
			
			System.out.println("Enter number of widgets produced: ");
			int widgets = kbd.nextInt();
			
			if(widgets < 0) 
				throw new NegativeNumberException("widgets");
			
			System.out.println("How many were defective?");
			int defective = kbd.nextInt();
			
			if(defective < 0)
				throw new NegativeNumberException("defective widgets");
			
			double ratio = exceptionalDivision(widgets, defective);
			
			System.out.println("One in every " + ratio + " widgets is defective.");
		} 
		catch(DivideByZeroException e) {
			System.out.println("Congratulations! A perfect record!");
		}
		catch(NegativeNumberException e) {
			System.out.println("Cannot have a negative number of" + e.getMessage());
		}
		System.out.println("End of program.");
				
	}
	
	public static double exceptionalDivision(double numerator, double denominator) throws DivideByZeroException {
		if(denominator == 0)
			throw new DivideByZeroException();
		
		return numerator/denominator;
	}

}

class NegativeNumberException extends Exception {
	NegativeNumberException(){};
	NegativeNumberException(String str) {super(str);}
}

class DivideByZeroException extends Exception{
	DivideByZeroException(){};
	DivideByZeroException(String str) {super(str);}
}