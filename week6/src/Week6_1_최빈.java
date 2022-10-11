import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week6_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		Buyer Buyer1 = new Buyer(); //Buyer 클래스의 인스턴스 생성
		
		System.out.println("How much money do you have?");
		Buyer1.money = kbd.nextInt(); //Buyer1.money값을 입력받음
		
		Tv t = new Tv(); //Product의 자식클래스들인 Tv, Computer, Video, Audio, NoteBook의 각 인스턴스 생성
		Computer c = new Computer();
		Video v = new Video();
		Audio a = new Audio();
		NoteBook n = new NoteBook();
		
		int select = 1; //사용자로부터 입력받을 변수 초기화
		
		while(select != 0) { //select가 0이 아니면 계속 while 반복문 실행
			System.out.println("What do you want to buy? Input 0 to quit.");
			System.out.println("1. Tv(100)     2. Computer(200)     3. Video(110)     4. Audio(50)     5. NoteBook(300)");
			select = kbd.nextInt(); //사용자로부터 select값을 입력받음

			int beforeMoney = Buyer1.money; // 금액 부족시 쇼핑리스트 출력을 하기 위해 switch문 이전과 이후의 Buyer1.money값 비교하기 위해 switch문 이전의 값 저장
			
			switch(select) {
			case 0: //사용자 입력값이 0이면 반복문 끝냄
				break;
			case 1: //사용자 입력값에 따라 buy하는 product가 달라짐 (case 1~5)
				Buyer1.buy(t);
				break;
			case 2:
				Buyer1.buy(c);
				break;
			case 3:
				Buyer1.buy(v);
				break;
			case 4:
				Buyer1.buy(a);
				break;
			case 5:
				Buyer1.buy(n);
				break;
			default: //사용자 입력값이 0~5가 아니라면 다음과 같은 문장 출력
				System.out.println("No such item.");
				break;
				
			}
			if(Buyer1.money == beforeMoney && select < 6) // Buyer1.money의 값이 switch문 실행 이전과 이후에 같으면 아무것도 안 산 것이므로 금액부족 -> while문 벗어나서 쇼핑리스트 출력, 같지않으면 무언가를 샀기때문에 다시 while문 반복 (근데 이 조건이 select가 6이상일 때도 만족하기 떄문에 select도 검사)
				break;
		}
		
		Buyer1.summary(); //Buyer1의 summary메서드 실행
		
	}

}

class Product { //조상클래스인 Product 클래스 생성
	int price; //멤버변수 선언
	int bonusPoint;
	Product(int price) { //price값을 매개변수로 받는 생성자
		this.price = price; //price와 bonusPoint 초기화
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product { //Product클래스의 자식인 Tv 클래스 생성
	Tv() {
		super(100); //100을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"Tv"가 출력되도록 toString 오버라이딩
		return "Tv";
	}
}

class Computer extends Product { //Product클래스의 자식인 Computer 클래스 생성
	Computer() {
		super(200);//200을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"Computer"가 출력되도록 toString 오버라이딩
		return "Computer";
	}
}

class Video extends Product {//Product클래스의 자식인 Video 클래스 생성
	Video() {
		super(110);//110을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"Video"가 출력되도록 toString 오버라이딩
		return "Video";
	}
}

class Audio extends Product { //Product클래스의 자식인 Audio 클래스 생성
	Audio() {
		super(50);//50을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"Audio"가 출력되도록 toString 오버라이딩
		return "Audio";
	}
}

class NoteBook extends Product { //Product클래스의 자식인 NoteBook 클래스 생성
	NoteBook() {
		super(300);//300을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"NoteBook"가 출력되도록 toString 오버라이딩
		return "NoteBook";
	}
}


class Buyer { //Buyer 클래스 생성
	int money = 0, i;//멤버변수 선언
	int bonusPoint = 0;
	Product item[] = new Product[10]; //Product타입의 참조변수 배열 선언 (최대 10개 인스턴스 저장 가능)
	
	void buy(Product pd) {
		if(pd.price > money) { //Buyer의 money보다 product의 price가 더 클 때 다음 문장 출력
			System.out.println("\nMoney is not enough.\n");
		} 
		else {
			System.out.println("You bought " + pd + "(" + pd.price + ").");
			money = money - pd.price; //pd에 따라 Buyer의 money와 bonusPoint 계산
			bonusPoint = bonusPoint + pd.bonusPoint;
			item[i++] = pd; //매개변수로 받은 Product타입의 참조변수를 배열에 저장하고 i를 1만큼 증가
		}
		
	}
	
	void summary() { //쇼핑리스트와 남은 돈과 적립된 보너스포인트 출력
		System.out.print("\nSHOPPING LIST: ");
		for(int j = 0; j < i; j++) 
			System.out.print(item[j] + " ");
		System.out.println("\nMONEY LEFT: " + money);
		System.out.println("CURRENT BONUS POINT: " + bonusPoint);
	}
}