import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week2_2_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		String degree; 		
		String input = "Y";
		int f;
		double c;

		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		
		while(input.equalsIgnoreCase("Y")) //input ���� 'y','Y'�̸� �ݺ��� ����. �ƴϸ� ��������
		{
			
			System.out.print("�����ǰ�� 'C', ȭ���ǰ�� 'F' �Է�: ");
			degree = kbd.nextLine(); 
		
			
			while(!degree.equalsIgnoreCase("c")&&!degree.equalsIgnoreCase("f")) //'C','c','F','f'�� �ƴ� �ٸ� ���� �Է��� ���
			{
				System.out.println("�߸��� �Է�");
				break;
			}
			
			if(degree.equalsIgnoreCase("c")) //'C','c' �Է��� ���
			{
				System.out.print("�����µ� �Է�: ");
				c = kbd.nextDouble();
				kbd.nextLine(); //���ۿ� �����ִ� ���� �ذ�
				
				f = (int) (9 * c / 5 + 32); //double�� �Է¹��� c�� �����ؼ� ����ϰ� int�� ����ȯ�Ͽ� f�� ����
				
				System.out.printf("����µ��� ���� %.1f��, ȭ�� %d���Դϴ�.", c, f); //printf�� ����ؼ� int�� ���� float�� �� ���
				System.out.println();
			}
			
			if(degree.equalsIgnoreCase("f"))
			{
				System.out.print("ȭ���µ� �Է�: ");
				f = kbd.nextInt();
				kbd.nextLine(); //���ۿ� �����ִ� ���� �ذ�
				
				c = (double)5 / 9 * (f - 32); // 5�� int���� double�� ����ȯ ������ �� ������ ����ϸ� ���� ���� Ÿ���� float�� ��
				
				System.out.printf("����µ��� ȭ�� %d��, ���� %.1f���Դϴ�.", f, c); 
				System.out.println();
			}
			
			
			System.out.print("����Ͻðڽ��ϱ�? (Y/N)");
			
			input = kbd.nextLine(); 
			
		}
		
		System.out.println("���α׷�����");
	}

}
