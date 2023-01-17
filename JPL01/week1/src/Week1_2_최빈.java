import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week1_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		int n1, n2, n3;
		float average;
		
		Scanner keyboard = new Scanner(System.in); //앞으로 keyboard라는 객체를 통해 키보드입력받음
		
		System.out.println("정수 세 개 입력");
		
		n1 = keyboard.nextInt(); //정수 하나를 n1에 정수로 입력받음
		n2 = keyboard.nextInt(); //정수 하나를 n2에 정수로 입력받음
		n3 = keyboard.nextInt(); //정수 하나를 n3에 정수로 입력받음
		
		average = (float)(n1 + n2 + n3) / 3; //n1, n2, n3을 더한 값을 int에서 float로 형변환 시켜준 뒤 3으로 나눔
		
		System.out.printf("평균 : %.2f", average); //printf를 사용해서 소수점 이하 둘째자리까지 출력

	}

}
