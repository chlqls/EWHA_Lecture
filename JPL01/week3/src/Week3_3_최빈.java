import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week3_3_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
//		String title;
//		int page; //�����ȳ� ����Ƽ���� �־��µ� ���� �ۼ��� �ڵ忡���� �ʿ��� �ּ�ó�� �߽��ϴ�!
		
		MyFile fold = new MyFile();//MyFile ������Ʈ ���� (���� File)
		MyFile fnew = new MyFile();//MyFile ������Ʈ ���� (���� ����� File)
		
		System.out.println("--File�����Է�(����,��������)--");
		
		fold.setTitle(kbd.nextLine());//setTitle�޼���� fold�� ���� ����
		fold.setPage(kbd.nextInt());//setPage�޼���� fold�� �������� ����
		fold.fileCopy(fnew); //fold�� ������ fnew�� ����
		
		System.out.println("<���� File>");
		fold.fileInfo();//fold�� ���� ���
		
		System.out.println("<����� File>");
		fnew.fileInfo();//fnew�� ���� ���
		
	}

}


class MyFile {//MyFileŬ���� ����
	
	private String title;//������� ����
	private int page;
	
	public void setTitle(String title) {//title �� �����ϴ� �޼ҵ� ����
		this.title = title;
	}
	
	public String getTitle() {//title �� ��ȯ�ϴ� �޼ҵ� ����
		return title;
	}

	public void setPage(int page) {//page �� �����ϴ� �޼ҵ� ����
		this.page = page;
	}
	
	public int getPage() {//page �� ��ȯ�ϴ� �޼ҵ� ����
		return page;
	}

	public void fileCopy(MyFile myFile) { //���� file�� ������ myFile�� ������ ����, ���������� ����ǵ��� �ϴ� �޼ҵ� ����
		myFile.title = title;
		myFile.page = page;
	}
	
	public void fileInfo() { //���� ���� ����ϴ� �޼ҵ� ����
		System.out.println("��������:" + title);
		System.out.println("������:" + page);
		
	}
}
