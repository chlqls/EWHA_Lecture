import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week1_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		
		int base, height;
		float area;
		
		Scanner keyboard = new Scanner(System.in); //앞으로 keyboard라는 객체를 통해 키보드입력받음
		
		System.out.print("Input base: ");
		base = keyboard.nextInt(); //밑변의 값을 base에 정수로 입력받음
		
		System.out.print("Input height: ");
		height = keyboard.nextInt(); //높이의 값을 height에 정수로 입력받음
		
		area = (float)(base * height) / 2; //base와 height를 곱한 값을 int에서 float로 형변환 시켜준 뒤 2로 나눔
		
		System.out.println("The area: " + area); //area 출력
		
	
	}

}