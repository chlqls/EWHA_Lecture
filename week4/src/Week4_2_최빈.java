import java.util.Scanner; //키보드입력을 위해 필요한 코드

class Facto {//Facto클래스 생성
	static int result; //static 변수
		
	static int factoVal(int x) { //x!(x factorial)을 계산하여 결과를 돌려주는 static 메서드
		int factorial = 1;
		for(int i = x; i > 0; i--) //i가 입력받은 numer에서 시작해서 1까지 1씩 줄어든다
			factorial *= i; // for문이 돌 때마다 result에 i를 곱해서 실제로 팩토리얼 계산함. 1일 때는 굳이 곱해줄 필요 없음.
		
		return  factorial;
	}
	
}

public class Week4_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.print("두 정수 입력(1 이상 10 이하): "); //정 수 두개 입력받음
		int num1 = kbd.nextInt();
		int num2 = kbd.nextInt();
		

		while(num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) { //범위 벗어나면 반복 하지않고 종료 
			
			Facto.result = Facto.factoVal(num1) - Facto.factoVal(num2);
			//입력된 값을 인자로 하여 static 메서드 factoVal을 클래스이름으로 호출하고 두 값의 차이를 static 변수 result에 저장
			
			System.out.println("Factorial(" + num1 + ") + Factorial(" + num2 + ") = " + Facto.result);
			//static 변수 result를 클래스 이름으로 접근하여 출력
			
			System.out.print("두 정수 입력(1 이상 10 이하): ");
			num1 = kbd.nextInt();
			num2 = kbd.nextInt();

		} 		
		System.out.println("범위가 잘못되었습니다. 종료합니다.");
	}
	
}


