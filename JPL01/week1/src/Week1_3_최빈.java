import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week1_3_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		int f;
		float c;
		
		Scanner keyboard = new Scanner(System.in); //������ keyboard��� ��ü�� ���� Ű�����Է¹���
		
		System.out.print("ȭ���µ� �Է�: ");
		
		f = keyboard.nextInt(); //ȭ���µ��� f�� ������ �Է¹���
		System.out.println();
		
		c = (float)5 / 9 * (f - 32); // 5�� int���� float�� ����ȯ ������ �� ������ ����ϸ� ���� ���� Ÿ���� float�� ��
		
		System.out.println("ȭ���µ�: " + f);
		System.out.printf("�����µ� : %.1f", c); //printf�� ����ؼ� �Ҽ��� ���� ù°�ڸ����� ���
	}

}
