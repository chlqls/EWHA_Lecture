//예제 1-2
import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		String season;
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Input your favorite month ");
		month = kbd.nextInt();
		
		switch(month)
		{
		case 12:
		case 1:
		case 2: 
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5: 
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8: 
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11: 
			season = "Fall";
			break;
		default:
			season = "strange season";
			break;
		}
	
		System.out.println("you like " + season);
		
	}

}
