import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week2_1_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		int month;
		
		System.out.print("�� �Է�: ");
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		month = kbd.nextInt(); //���� month�� ������ �Է¹���
		
		switch(month)
		{
		case 1:
		case 3:
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			System.out.println(month + "������ 31���� �ֽ��ϴ�."); //1,3,5,7,8,10,12������ 31���� ������ ���
			break; //switch�� ��������
		case 4:
		case 6:
		case 9:
		case 11: 
			System.out.println(month + "������ 30���� �ֽ��ϴ�."); //4,6,9,11������ 30���� ������ ���
			break; //switch�� ��������
		case 2: 
			System.out.println(month + "������ 28���� �ֽ��ϴ�."); //2������ 28���� ������ ���
			break; //switch�� ��������
		default:
			System.out.println("�Է� ����"); //1~12�̿��� ���� �ԷµǾ��� ��
			break; //switch�� ��������
		}
	}

}
