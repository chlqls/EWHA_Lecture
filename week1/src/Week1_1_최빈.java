import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week1_1_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		
		int base, height;
		float area;
		
		Scanner keyboard = new Scanner(System.in); //������ keyboard��� ��ü�� ���� Ű�����Է¹���
		
		System.out.print("Input base: ");
		base = keyboard.nextInt(); //�غ��� ���� base�� ������ �Է¹���
		
		System.out.print("Input height: ");
		height = keyboard.nextInt(); //������ ���� height�� ������ �Է¹���
		
		area = (float)(base * height) / 2; //base�� height�� ���� ���� int���� float�� ����ȯ ������ �� 2�� ����
		
		System.out.println("The area: " + area); //area ���
		
	
	}

}