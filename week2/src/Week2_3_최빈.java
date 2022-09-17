import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week2_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		int number;
		int result = 1; //팩토리얼 계산을 위해 1로 초기화
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("Factorial을 계산할 정수 입력");
		number = kbd.nextInt(); //팩토리얼 계산할 수를 정수로 number에 입력받음 
		
		while(number <= 0 || number > 10) //1~10 범위에서 벗어나는 경우 정상적인 수가 입력될 때까지 반복해서 재입력 받음
		{
			System.out.println("정수 재입력(1~10) :");
			number = kbd.nextInt();
		}
		
		System.out.print(number + "! = "); //팩토리얼 계산식 출력(28~39줄)
		for(int i = number; i > 0; i--) //i가 입력받은 numer에서 시작해서 1까지 1씩 줄어든다
		{
			if(i == 1) //마지막으로 i가 1일 때는 1만 출력
				System.out.print(i);
			else //i가 1이 아닐 때는 i와 곱셈기호까지 출력
				{
					System.out.print(i + " X ");
					result *= i; // for문이 돌 때마다 result에 i를 곱해서 실제로 팩토리얼 계산함. 1일 때는 굳이 곱해줄 필요 없음.
				}
		}
		System.out.print(" = " + result);
	}

}
