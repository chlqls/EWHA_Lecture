import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week7_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("Input radius for a circle"); //circle의 radius 입력받고 이 값으로 Circle 인스턴스 생성
		Circle circle = new Circle(kbd.nextDouble());
		
		System.out.println("Input length for a square"); //square의 length 입력받고 이 값으로 Square 인스턴스 생성
		Square square = new Square(kbd.nextDouble());
		
		System.out.println("Input a for a triangle"); //triangle의 세변 각각의 길이를 입력받고 이 값들로 Triangle 인스턴스 생성
		double a = kbd.nextDouble();
		System.out.println("Input b for a triangle");
		double b = kbd.nextDouble();
		System.out.println("Input c for a triangle");
		double c = kbd.nextDouble();
		Triangle triangle = new Triangle(a, b, c);
		
		System.out.println("<Circle>"); //Circle, Square, Triangle의 참조변수들을 통해 각 클래스의 모든 메서드 실행 및 결과 출력
		System.out.println("Area: " + circle.area());
		System.out.println("Circumference: " + circle.perimeter());
		
		System.out.println("<Square>");
		System.out.println("Area: " + square.area());
		System.out.println("Circumference: " + square.perimeter());
		
		System.out.println("<Triangle>");
		System.out.println("Area: " + triangle.area());
		System.out.println("Circumference: " + triangle.perimeter());
		
	}
}

interface Geometry { //Geometry 인터페이스 생성
	double PI = 3.14159; //인터페이스의 구성요소로는 추상메서드와 상수만 가능힘. 모든 멤버변수는 public static final인데 생략가능함
	double area(); // 모든 메서드는 public abstract 인데 생략 가능홤. abstract메서드이므로 body부분 없이 선언만 함.
	double perimeter(); //이 인터페이스를 구현하는 클래스마다 내용이 다를 것임.
}

class Circle implements Geometry{ //Geometry 인터페이스를 구현하는 Circle 클래스 생성
	double radius; //멤버변수 선언
	
	Circle() {	} //default 생성자
	Circle(double radius) { //매개변수로 입력받은 값을 radius에 저장하는 생성자 
		this.radius = radius;
	}

	public double area() { //Circle클래스에 맞게 인터페이스의 추상메서드들 완성 
		return PI * radius * radius;
	}
	public double perimeter() {
		return 2 * PI * radius;
	}
}

class Square implements Geometry{ //Geometry 인터페이스를 구현하는 Square 클래스 생성
	double side;
	
	Square() {	}
	Square(double side) { //매개변수로 입력받은 값을 side에 저장하는 생성자 
		this.side = side;
	}

	public double area() { //Square클래스에 맞게 인터페이스의 추상메서드들 완성 
		return side * side;
	}
	public double perimeter() {
		return 4 * side;
	}
}

class Triangle implements Geometry{ //Geometry 인터페이스를 구현하는 Triangle 클래스 생성
	double a, b, c, s; //a,b,c는 삼각형 세변 각각의 길이이고, s는 생성자에서 초기화

	Triangle() {	}
	Triangle(double a, double b, double c) {  //매개변수로 입력받은 값들을 각각 멤버변수에 저장하고 넓이를 구할 때 필요한 값인 s를 초기화하는 생성자 
		this.a = a;
		this.b = b;
		this.c = c;
		this.s = (a + b + c) / (double)2;
	}

	public double area() { //Triangle클래스에 맞게 인터페이스의 추상메서드들 완성 
		return Math.sqrt(s* (s - a) * (s - b) * (s - c));
	}
	public double perimeter() { 
		return a + b + c;
	}
}


