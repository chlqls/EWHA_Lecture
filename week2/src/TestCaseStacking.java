//예제 2
import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class TestCaseStacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		
		int score = kbd.nextInt();
		char grade;
		
		int score2 = score / 10;
		
		switch(score2)
		{
		case 10:
		case 9: 
			grade = 'A';
			break;
		case 8: 
			grade = 'B';
			break;
		case 7: 
			grade = 'C';
			break;
		case 6: 
			grade = 'D';
			break;
		default: 
			grade = 'F';
			break;
		}
		System.out.println("Your score is " + score + " and your grade is " + grade);
	}

}
