import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week2_3_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		int number;
		int result = 1; //���丮�� ����� ���� 1�� �ʱ�ȭ
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		System.out.println("Factorial�� ����� ���� �Է�");
		number = kbd.nextInt(); //���丮�� ����� ���� ������ number�� �Է¹��� 
		
		while(number <= 0 || number > 10) //1~10 �������� ����� ��� �������� ���� �Էµ� ������ �ݺ��ؼ� ���Է� ����
		{
			System.out.println("���� ���Է�(1~10) :");
			number = kbd.nextInt();
		}
		
		System.out.print(number + "! = "); //���丮�� ���� ���(28~39��)
		for(int i = number; i > 0; i--) //i�� �Է¹��� numer���� �����ؼ� 1���� 1�� �پ���
		{
			if(i == 1) //���������� i�� 1�� ���� 1�� ���
				System.out.print(i);
			else //i�� 1�� �ƴ� ���� i�� ������ȣ���� ���
				{
					System.out.print(i + " X ");
					result *= i; // for���� �� ������ result�� i�� ���ؼ� ������ ���丮�� �����. 1�� ���� ���� ������ �ʿ� ����.
				}
		}
		System.out.print(" = " + result);
	}

}
