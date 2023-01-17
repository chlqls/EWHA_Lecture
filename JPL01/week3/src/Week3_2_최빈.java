import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week3_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Circle circle = new Circle(); //Circle 오브젝트 생성
		
		System.out.print("반지름입력:");
		circle.setRadius(kbd.nextDouble()); //반지름을 사용자로부터 받아 인스턴스 변수에 저장
		
		System.out.println("반지름:" + circle.getRadius()); //반지름 값 출력
		
		circle.circleInfo(); //circleInfo() 메소드로 원둘레와 원넓이 출력
	}

}


class Circle { //Circle클래스 생성
	
	final double PI = 3.14159;//멤버변수 선언
	private double radius;
	
	public void setRadius(double radius) {//radius 값 설정
		this.radius = radius;
	}
	
	public double getRadius() { //radius 값 반환
		return radius;
	}
	
	public double perimeter() { //원둘레 값 반환
		double perimeter = PI * 2 * radius;
		return perimeter;
	}
	
	public double area() { //원넓이 값 반환
		double area = PI * radius * radius;
		return area;
	}
	
	public void circleInfo() { //원둘레 및 원의 넓이 출력
		System.out.printf("원둘레:%.2f", perimeter());
		System.out.printf("\n원넓이:%.2f", area());
	}
}
