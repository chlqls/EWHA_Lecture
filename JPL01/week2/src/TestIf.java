//예제 1
import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		String season;
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Input your favorite month ");
		month = kbd.nextInt();
		
		if(month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if(month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if(month == 9 || month == 10 || month == 11)
			season = "Fall";
		else 
			season = "strange season";
		
		System.out.println("you like " + season);
		
	}

}
