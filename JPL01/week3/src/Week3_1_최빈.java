import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week3_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Song s1 = new Song();
		Song s2 = new Song(); //Song 오브젝트를 두 개 생성
		int num; //사용자가 선택한 노래 번호
		
		System.out.println("*Song 1*");//사용자로부터 곡명, 가수명, 가격을 받아 s1의 변수값에 각각 저장
		System.out.print("곡명입력: ");
		s1.title = kbd.nextLine();
		System.out.print("가수명입력: ");
		s1.singer = kbd.nextLine();
		System.out.print("가격입력: ");
		s1.price = kbd.nextInt();
		kbd.nextLine();
		
		System.out.println("\n*Song 2*");//사용자로부터 곡명, 가수명, 가격을 받아 s2의 변수값에 각각 저장
		System.out.print("곡명입력: ");
		s2.title = kbd.nextLine();
		System.out.print("가수명입력: ");
		s2.singer = kbd.nextLine();
		System.out.print("가격입력: ");
		s2.price = kbd.nextInt();
		kbd.nextLine();
		
		System.out.println("\n노래를 고르세요");
		System.out.println("1: " + s1.title + " 2: " + s2.title);
		num = kbd.nextInt(); //사용자가 입력한 int값 num에 저장
		
		if(num == 1) { //num이 1이면 s1의 play와 price메소드 실행
			s1.play();
			s1.price();
		}
		else if(num == 2) {//num이 2이면 s2의 play와 price메소드 실행
			s2.play();
			s2.price();
		}
		
		System.out.println("감사합니다.");
		
	}

}


class Song { //Song클래스 생성
	
	public String title; //멤버변수 선언
	public String singer;
	public int price;
	
	public void price() { //price메소드 정의
		System.out.println(price + "원입니다.");
	}
	
	public void play() {//play메소드 정의
		System.out.println("노래들어요: \"" + title + "\" by " + singer );
		
	}
}
