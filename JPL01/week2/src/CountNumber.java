//���� 4
import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		String input = "Y";
		int number = 0, even = 0, odd = 0, zero = 0, digit;
		
		System.out.println("<������ �����ϴ� ¦��, Ȧ��, 0�� ���� ���� ���α׷�>");
		while(input.equalsIgnoreCase("Y"))
		{
			System.out.println("���� ���� �Է�");
			number = kbd.nextInt();
			while(number <= 0)
			{
				System.out.println("���� ���� �Է�");
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
			System.out.println("0�� ��: " + zero + "��");
			System.out.println("¦���� ��: " + even + "��");
			System.out.println("Ȧ���� ��: " + odd + "��");
			
			zero = 0;
			even = 0;
			odd = 0;
			
			System.out.println("����Ͻðڽ��ϱ�? (Y/N)");
			
			kbd.nextLine();
			input = kbd.nextLine();
			
		}
		
	}

}
