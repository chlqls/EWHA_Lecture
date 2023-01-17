import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week2_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		int month;
		
		System.out.print("월 입력: ");
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		month = kbd.nextInt(); //월을 month에 정수로 입력받음
		
		switch(month)
		{
		case 1:
		case 3:
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			System.out.println(month + "월에는 31일이 있습니다."); //1,3,5,7,8,10,12월에는 31일이 있음을 출력
			break; //switch문 빠져나감
		case 4:
		case 6:
		case 9:
		case 11: 
			System.out.println(month + "월에는 30일이 있습니다."); //4,6,9,11월에는 30일이 있음을 출력
			break; //switch문 빠져나감
		case 2: 
			System.out.println(month + "월에는 28일이 있습니다."); //2월에는 28일이 있음을 출력
			break; //switch문 빠져나감
		default:
			System.out.println("입력 오류"); //1~12이외의 값이 입력되었을 때
			break; //switch문 빠져나감
		}
	}

}
