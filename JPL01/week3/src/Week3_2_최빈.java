import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week3_2_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		Circle circle = new Circle(); //Circle ������Ʈ ����
		
		System.out.print("�������Է�:");
		circle.setRadius(kbd.nextDouble()); //�������� ����ڷκ��� �޾� �ν��Ͻ� ������ ����
		
		System.out.println("������:" + circle.getRadius()); //������ �� ���
		
		circle.circleInfo(); //circleInfo() �޼ҵ�� ���ѷ��� ������ ���
	}

}


class Circle { //CircleŬ���� ����
	
	final double PI = 3.14159;//������� ����
	private double radius;
	
	public void setRadius(double radius) {//radius �� ����
		this.radius = radius;
	}
	
	public double getRadius() { //radius �� ��ȯ
		return radius;
	}
	
	public double perimeter() { //���ѷ� �� ��ȯ
		double perimeter = PI * 2 * radius;
		return perimeter;
	}
	
	public double area() { //������ �� ��ȯ
		double area = PI * radius * radius;
		return area;
	}
	
	public void circleInfo() { //���ѷ� �� ���� ���� ���
		System.out.printf("���ѷ�:%.2f", perimeter());
		System.out.printf("\n������:%.2f", area());
	}
}
