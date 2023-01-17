import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class HW1_5_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Shape[] myShape = new Shape[10]; // 참조변수는 부모타입으로 객체배열 선언
		
		int i = 0; //계속 반복문을 사용하면서 배열 저장할 때 필요한 변수
		
		while(i < 10) { //배열의 크기를 10으로 설정했으므로 i가 10이 되기 전까지만 반복문 실행
			System.out.println("1.Circle  2.Rectangle  3.Show  4.Exit");
			int select = kbd.nextInt();
			
			if(select == 1) {
				Circle c = new Circle();// 사용자가 1을 입력하면 Circle 인스턴스 생성
				System.out.print("x = "); //x,y,r 값을 입력받고 저장
				int x = kbd.nextInt();
				System.out.print("y = ");
				int y = kbd.nextInt();
				System.out.print("r = ");
				int r = kbd.nextInt();
				
				c.setPoint(x, y, r); //입력받은 값들을 c의 오버로딩된 setPoint메서드를 이용해서 각 값을 private로 선언된 변수에 저장
				myShape[i] = c; //myShape[i].setPoint(x, y, r);는 접근불가하여 에러가 발생하기 때문에 이렇게 Circle 인스턴스를 생성하고 입력받은 값을 저장하고 업캐스팅하여 myShape[i]에 연결 
				
				i++; //다음에는 다음 배열에 저장하기 위해 i++실행
			}
			
			else if(select == 2) {
				Rectangle r = new Rectangle(); //사용자가 2를 입력하면 Rectangle 인스턴스 생성
				System.out.print("x = "); //x,y,w,h값을 입력받고 저장
				int x = kbd.nextInt();
				System.out.print("y = ");
				int y = kbd.nextInt();
				System.out.print("w = ");
				int w = kbd.nextInt();
				System.out.print("h = ");
				int h = kbd.nextInt();
				
				r.setPoint(x, y, w, h); // 입력받은 값들을 r의 오버로딩된 setPoint메서드를 이용해서 각 값을 private로 선언된 변수에 저장
				myShape[i] = r; // myShape[i].setPoint(x, y, w, h);는 접근불가하여 에러가 발생하기 떄문에 이렇게 Rectangle 인스턴스를 생성하고 입력받은 값을 저장하고 업캐스팅하여 myShape[i]에 연결
				
				i++;
			}
			
			else if(select == 3) { //사용자가 3을 입력하면 각 인스턴스의 오버라이딩된 display메서드 실행
				for(int j = 0; j < i; j++) //배열에 i개가 저장되어있는 상태이기 때문에 for문 i번 반복
					myShape[j].display();
				
			}
			
			else if(select == 4) //사용자가 4를 입력하면 반복문 종료
				break;
			
			else //1~4가 아닌 수를 입력하였다면 잘못된 입력이라는 문장 출력
				System.out.println("Wrong Input");
			
			System.out.println();

		}
				
	}

}


class Shape { //StudentInformation 클래스 생성
	private int x; //멤버변수 선언
	private int y;
	
	public void setPoint(int x, int y) { //매개변수로 받은 x,y를 멤버변수에 저장
		this.x = x;
		this.y = y;
	}
	
	public void display() { 
		System.out.println("Point (x,y) = (" + x + "," + y + ")");
	}
}


class Circle extends Shape { //StudentInformation클래스를 상속받은 StudentScore 클래스 생성
	private int radius; //멤버변수 선언

	public void setPoint(int x, int y, int r) { //부모클래스인 Shape 클래스의 setPoint메서드를 오버로딩하여 추가적으로 radius값 저장
		super.setPoint(x,y); //super을 통해 부모클래스의 메서드 호출 -> 코드 재사용
		this.radius = r;
	}
	
	public void display() { //부모클래스인 Shape의 display메서드를 오버라이딩하여 추가적으로 radius값 출력
		super.display(); // super을 통해 부모클래스의 메서드 호출하여 코드 재사용
		System.out.println("Radius r = " + radius);
		
	}

}

class Rectangle extends Shape { //StudentInformation클래스를 상속받은 StudentScore 클래스 생성
	private int width; //멤버변수 선언
	private int height;

	public void setPoint(int x, int y, int w, int h) { //부모클래스인 Shape 클래스의 setPoint메서드를 오버로딩하여 추가적으로 width와 height 값 저장
		super.setPoint(x, y);
		this.width = w;
		this.height = h;
	}
	
	public void display() { //부모클래스인 Shape의 display메서드를 오버라이딩하여 추가적으로 width와 height 값 출력
		super.display();
		System.out.println("Width: " + width + ", Height: " + height);
	}

}