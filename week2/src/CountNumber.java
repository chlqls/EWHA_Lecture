//예제 4
import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		String input = "Y";
		int number = 0, even = 0, odd = 0, zero = 0, digit;
		
		System.out.println("<정수를 구성하는 짝수, 홀수, 0의 수를 세는 프로그램>");
		while(input.equalsIgnoreCase("Y"))
		{
			System.out.println("양의 정수 입력");
			number = kbd.nextInt();
			while(number <= 0)
			{
				System.out.println("양의 정수 입력");
				number = kbd.nextInt();
			}
			
			while(number > 0)
			{
				digit = number % 10;
				if(digit == 0) zero++;
				else
				{
					if(digit % 2 == 0) even++;
					else odd++;
				}
				number = number / 10;
			}
			System.out.println("0의 수: " + zero + "개");
			System.out.println("짝수의 수: " + even + "개");
			System.out.println("홀수의 수: " + odd + "개");
			
			zero = 0;
			even = 0;
			odd = 0;
			
			System.out.println("계속하시겠습니까? (Y/N)");
			
			kbd.nextLine();
			input = kbd.nextLine();
			
		}
		
	}

}
