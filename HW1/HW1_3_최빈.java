import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class HW1_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Product pd[] = new Product[3]; // Product 배열을 생성
		
		pd[0] = new Tv(); //Product배열에 각 제품 인스턴스 생성하고 연결
		pd[1] = new Computer();
		pd[2] = new Audio();
		
		System.out.print("How many buyers? "); //Buyer의 수 입력받기
		Buyer buyer[] = new Buyer[kbd.nextInt()]; //입력받은 수만큼의 크기의 Buyer 배열 생성
		
		for(int i = 0; i < buyer.length; i++) { //반복문 이용해서 각 buyer 구매 내역 저장
			
			buyer[i] = new Buyer(); // 각 Buyer 배열에 Buyer인스턴스 생성하고 연결
			
			System.out.println("\n<Buyer" + (i + 1) + ">");
			
			boolean check = false; 
			while(!check) {//boolean타입 변수인 check를 사용해서 setMoney의 결과가 false면 정상입력 받을 때까지 반복해서 입력받음
				System.out.println("How much money do you have?");
				check = buyer[i].setMoney(kbd.nextInt());//buyer[i]의 money값을 입력받아서 반환값을 check에 저장
			}
			
			int select = 1; //사용자로부터 입력받을 변수 초기화
			
			while(select != 0) { //select가 0이 아니면 계속 while 반복문 실행
				System.out.println("Choose the item. You have " + buyer[i].getMoney() + "won left. Input 0 to quit.");
				System.out.println("1. Tv(100)     2. Computer(200)     3. Audio(50)");
				select = kbd.nextInt(); //사용자로부터 select값을 입력받음
		
				switch(select) {
				case 0: //사용자 입력값이 0이면 switch문 빠져나감
					break;
				case 1: //사용자 입력값에 따라 buy하는 product가 달라짐 (case 1~3)
					buyer[i].buy(pd[0]);
					break;
				case 2:
					buyer[i].buy(pd[1]);
					break;
				case 3:
					buyer[i].buy(pd[2]);
					break;
				default: //사용자 입력값이 0~3이 아니라면 다음과 같은 문장 출력
					System.out.println("Wrong Input");
					break;
					
				}
			}
		}
		
		System.out.println("\n<Shopping Result>");
		for(int i = 0; i < buyer.length; i++) { //반복문을 이용해서 결과 출력
			System.out.println("<Buyer " + (i + 1) + ">");
			buyer[i].summary();
		}
		
		
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

class Audio extends Product { //Product클래스의 자식인 Audio 클래스 생성
	Audio() {
		super(50);//50을 매개변수로 넘겨주며 조상클래스 생성자인 super를 호출하여 조상의 멤버변수 초기화
	}
	public String toString() { //"Audio"가 출력되도록 toString 오버라이딩
		return "Audio";
	}
}


class Buyer { //Buyer 클래스 생성
	private int money = 0;//멤버변수 선언
	int bonusPoint = 0, i;
	Product item[] = new Product[10]; //Product타입의 참조변수 배열 선언 (최대 10개 인스턴스 저장 가능)
	
	public int getMoney() { //private 변수인 money의 getter와 setter 정의
		return money;
	}

	public boolean setMoney(int money) { 
		if(money <= 0) {// 금액이 0 이하면 해당 문장 출력하고 false 반환
			System.out.println("Money should be positive.");
			return false;
		}
		else { //매개변수로 받은 금액이 0보다 크면 money에 저장하고 true 반환
			this.money = money;
			return true;
		}
	}
		

	void buy(Product pd) {
		if(pd.price > money) { //Buyer의 money보다 product의 price가 더 클 때 다음 문장 출력
			System.out.println("Money is not enough.\n");
		} 
		else {
			System.out.println("You bought " + pd + "(" + pd.price + ").");
			money = money - pd.price; //pd에 따라 Buyer의 money와 bonusPoint 계산
			bonusPoint = bonusPoint + pd.bonusPoint;
			item[i++] = pd; //매개변수로 받은 Product타입의 참조변수를 배열에 저장하고 i를 1만큼 증가
		}
		
	}
	
	void summary() { //쇼핑리스트와 남은 돈과 적립된 보너스포인트 출력
		System.out.print("- Shopping list: ");
		for(int j = 0; j < i; j++) 
			System.out.print(item[j] + " ");
		System.out.println("\n- Money left: " + money);
		System.out.println("- Current bous point: " + bonusPoint);
	}
}
