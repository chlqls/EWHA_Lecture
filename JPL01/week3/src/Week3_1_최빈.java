import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week3_1_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		Song s1 = new Song();
		Song s2 = new Song(); //Song ������Ʈ�� �� �� ����
		int num; //����ڰ� ������ �뷡 ��ȣ
		
		System.out.println("*Song 1*");//����ڷκ��� ���, ������, ������ �޾� s1�� �������� ���� ����
		System.out.print("����Է�: ");
		s1.title = kbd.nextLine();
		System.out.print("�������Է�: ");
		s1.singer = kbd.nextLine();
		System.out.print("�����Է�: ");
		s1.price = kbd.nextInt();
		kbd.nextLine();
		
		System.out.println("\n*Song 2*");//����ڷκ��� ���, ������, ������ �޾� s2�� �������� ���� ����
		System.out.print("����Է�: ");
		s2.title = kbd.nextLine();
		System.out.print("�������Է�: ");
		s2.singer = kbd.nextLine();
		System.out.print("�����Է�: ");
		s2.price = kbd.nextInt();
		kbd.nextLine();
		
		System.out.println("\n�뷡�� ������");
		System.out.println("1: " + s1.title + " 2: " + s2.title);
		num = kbd.nextInt(); //����ڰ� �Է��� int�� num�� ����
		
		if(num == 1) { //num�� 1�̸� s1�� play�� price�޼ҵ� ����
			s1.play();
			s1.price();
		}
		else if(num == 2) {//num�� 2�̸� s2�� play�� price�޼ҵ� ����
			s2.play();
			s2.price();
		}
		
		System.out.println("�����մϴ�.");
		
	}

}


class Song { //SongŬ���� ����
	
	public String title; //������� ����
	public String singer;
	public int price;
	
	public void price() { //price�޼ҵ� ����
		System.out.println(price + "���Դϴ�.");
	}
	
	public void play() {//play�޼ҵ� ����
		System.out.println("�뷡����: \"" + title + "\" by " + singer );
		
	}
}
