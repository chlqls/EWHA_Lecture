import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week2_4_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		int height;
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		System.out.print("Enter the height of the triangle : ");
		height = kbd.nextInt(); //���̸� ������ �Է¹���
		
		for(int i = 1; i <= height; i++) //������ height����ŭ �ݺ���
		{
			for(int j = 1; j <= height - i; j++) // �־��� �׸�ó�� ���� ����� ��Ÿ���� ���� *��ȣ �տ� ������ height - i ����ŭ �Է�
				System.out.print(" ");
			for(int j = 1; j <= i * 2 - 1; j++) // *��ȣ�� i * 2 - 1 ����ŭ �Է�
				System.out.print("*");
			System.out.println(); // ����� *��ȣ�� ���� ��� �Է��ϸ� �����ٷ� �Ѿ
		}
		
	}

}