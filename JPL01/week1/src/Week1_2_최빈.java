import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week1_2_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		int n1, n2, n3;
		float average;
		
		Scanner keyboard = new Scanner(System.in); //������ keyboard��� ��ü�� ���� Ű�����Է¹���
		
		System.out.println("���� �� �� �Է�");
		
		n1 = keyboard.nextInt(); //���� �ϳ��� n1�� ������ �Է¹���
		n2 = keyboard.nextInt(); //���� �ϳ��� n2�� ������ �Է¹���
		n3 = keyboard.nextInt(); //���� �ϳ��� n3�� ������ �Է¹���
		
		average = (float)(n1 + n2 + n3) / 3; //n1, n2, n3�� ���� ���� int���� float�� ����ȯ ������ �� 3���� ����
		
		System.out.printf("��� : %.2f", average); //printf�� ����ؼ� �Ҽ��� ���� ��°�ڸ����� ���

	}

}
