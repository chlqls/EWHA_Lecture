import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week1_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		int f;
		float c;
		
		Scanner keyboard = new Scanner(System.in); //앞으로 keyboard라는 객체를 통해 키보드입력받음
		
		System.out.print("화씨온도 입력: ");
		
		f = keyboard.nextInt(); //화씨온도를 f에 정수로 입력받음
		System.out.println();
		
		c = (float)5 / 9 * (f - 32); // 5를 int에서 float로 형변환 시켜준 뒤 나머지 계산하면 최종 값의 타입이 float가 됨
		
		System.out.println("화씨온도: " + f);
		System.out.printf("섭씨온도 : %.1f", c); //printf를 사용해서 소수점 이하 첫째자리까지 출력
	}

}
