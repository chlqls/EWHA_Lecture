import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week4_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		Song song;  //참조변수만 선언
		
		System.out.println("*Song 정보*");

		System.out.print("곡명:");
		String title = kbd.nextLine(); // title 정보 String 변수에 입력받음
		
		while(title.equals("")) { //곡명이 없는 경우 곡명 입력받을 때까지 반복해서 질문
			System.out.println("곡명은 반드시 필요합니다.");
			System.out.print("곡명:");
			title = kbd.nextLine();
		}

		System.out.print("가수명:"); //가수명과 가격 정보를 각각 String과 int 변수에 입력받음
		String singer = kbd.nextLine();
		System.out.print("가격:");
		int price = kbd.nextInt();

		
		if(singer.equals("")) //가수정보가 없을 경우 title, price만 있는 생성자 호출하여 song에 객체 연결
			song = new Song(title, price);
		
		else //가수정보가 있을 경우 title, singer, price가 있는 생성자 호출하여 song에 객체 연결
			song = new Song(title, singer, price);
		
		System.out.println("몇번 들으시겠습니까?");
		int num = kbd.nextInt();
		int sum = 0;
		for(int i = 0; i < num; i++) {//입력받은 수만큼 song의 play메서드 실행하고 총 가격인 sum을 song의 price만큼 증가
			song.play();
			sum += song.price;
		}
		
		System.out.println("총 " + sum + "원입니다.");
		
	}

}


class Song {//Song클래스 생성
	
	public String title;//멤버변수 선언
	public String singer;
	public int price;
	
	public Song() {}
	
	public Song(String title, int price) { //매개변수로 title, price를 받는 생성자 정의
		this(title, "모름", price); //가수정보가 없는 경우 "모름"을 인자로 다른 생성자 호출
	}
	
	public Song(String title, String singer, int price) {//매개변수로 title, singer, price가 모두 받는 생성자 정의
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public void play() { //제목 및 가수 출력
		System.out.println(title + " by " + singer);
	}
	
	
}