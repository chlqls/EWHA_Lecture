import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week5_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		
		Play play = new Play(); // 자식클래스인 Play와 Film을 이용하여 인스턴스를 생성
		Film film = new Film(); 
		
		System.out.println("Input Title for Play"); //play의 title, director, writer, performanceCost를 입력받는다.
		play.setTitle(kbd.nextLine());
		
		System.out.println("Input Director for Play");
		play.setDirector(kbd.nextLine());
		
		System.out.println("Input Writer for Play");
		play.setWriter(kbd.nextLine());
		
		System.out.println("Input Title for Film"); //film의 title, director, writer, boxOfficeGross를 입력받는다.
		film.setTitle(kbd.nextLine());
		
		System.out.println("Input Director for Film");
		film.setDirector(kbd.nextLine());
		
		System.out.println("Input Writer for Film");
		film.setWriter(kbd.nextLine());
		
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());
		
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());

		play.display(); //play의 display메서드 실행
		System.out.println();
		film.display(); //film의 display메서드 실행
		
		
	}

}


class Production {//Production클래스 생성

	Production() {} //default 생성자 선언
	
	private String title; //멤버변수 선언
	private String director;
	private String writer;
	
	public String getTitle() { //private 변수인 title, director, writer 의 getter, setter 메서드 정의
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void display() { //title,director,writer을 출력하는 display메서드 정의
		System.out.println("Title:" + title);
		System.out.println("Director:" + director);
		System.out.println("Writer:" + writer);
	}
	
}
	
class Play extends Production { //Production클래스를 상속받는 Play클래스 생성
	
	Play() { super(); } //default 생성자 선언(자손의 생성자의 첫 문장에서 조상의 생성자를 호출)
	
	private int performanceCost; //멤버변수 선언

	public int getPerformanceCost() { //private 변수인 performanceCost의 getter, setter 메서드 정의
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {
		this.performanceCost = performanceCost;
	}
	
	public void display() { //조상클래스인 Production의 display 메서드 오버라이딩(performaceCost 출력을 추가함)
		super.display(); //조상클래스인 Production의 display 실행
		System.out.println("performance cost:" + performanceCost);
	}
		
}
	
	
class Film extends Production { //Production클래스를 상속받는 Film클래스

	Film() { super(); } //default 생성자 선언(자손의 생성자의 첫 문장에서 조상의 생성자를 호출)
	
	private int boxOfficeGross;//멤버변수 선언

	public int getBoxOfficeGross() { //private 변수인 boxOfficeGross의 getter, setter 메서드 정의
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {
		this.boxOfficeGross = boxOfficeGross;
	}
	
	public void display() { //조상클래스인 Production의 display 메서드 오버라이딩(boxOfficeGross 출력을 추가함)
		super.display();
		System.out.println("boxOfficeGross:" + boxOfficeGross);
	}
		
}


	
	