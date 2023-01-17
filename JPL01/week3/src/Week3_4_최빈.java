import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week3_4_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		MenuOrder menu = new MenuOrder(); //MenuOrder 오브젝트 생성
		
		System.out.println("--- 음료가격 설정 ---");

		System.out.print("Coke가격:");
		menu.setPrice("coke", kbd.nextInt());
		System.out.print("Lemonade가격:");
		menu.setPrice("lemonade", kbd.nextInt());
		System.out.print("Coffee가격:");
		menu.setPrice("coffee", kbd.nextInt()); //20~25줄: 사용자로부터 입력 받은 각 음료의 가격을 menu의 setPrice메소드를 사용하여 인스턴스변수값 설정
		
		
		String answer = "Y";
		while(answer.equalsIgnoreCase("y")) { //대소문자 상관없이 answer가 y일 때 계속 반복문 실행
			System.out.println("\n--- 돈을 넣으세요 ---");
			menu.setInputMoney(kbd.nextInt()); //사용자로부터 입력받은 금액을 setInputMoney메소드를 사용하여 menu의 inputMoney값에 저장
			
			menu.showMenu();
			
			menu.showResult(menu.getInputMoney()); //private인 inputMoney값을 게터를 이용하여 showResult메소드의 인자로 전달
			
			kbd.nextLine(); //남아있는 엔터를 해결하기 위한 코드
			System.out.println("계속 하시겠습니까?(y/n)");
			answer = kbd.nextLine();
			menu.setInputMoney(0); //반복할 때마다 menu의 inputMoney값을 초기화
		}
		
		
	}

}


class MenuOrder {

	Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
	
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setPrice(String drink, int price) { //String과 int를 인자로 받아서 각 음료의 가격을 설정하는 메소드
		if(drink.equalsIgnoreCase("coke")) {
			cokePrice = price;
		}
		else if(drink.equalsIgnoreCase("lemonade")) {
			lemonadePrice = price;
		}
		else if(drink.equalsIgnoreCase("coffee"))
		coffeePrice = price;
	}
	
	public void setInputMoney(int inputMoney) { //inputMoney 설정 (추가로 정의한 메소드)
		this.inputMoney = inputMoney;
	}
	public int getInputMoney() { //inputMoney 반환 (추가로 정의한 메소드)
		return inputMoney;
	}
	
	public void showMenu() { //각 음료와 가격정보 화면에 보여줌
		System.out.println("--- 음료를 선택하세요 ---");
		System.out.println("1. Coke: " + cokePrice);
		System.out.println("2. Lemonade: " + lemonadePrice);
		System.out.println("3. Coffee: " + coffeePrice);
	}
	
	public void showResult(int inputMoney) { //int 값을 인자로 받아서 각 음료의 가격과 비료하여 그에 맞는 결과 출력
		
		drinkSelected = kbd.nextLine(); //메뉴 선택 
		
		if(drinkSelected.equals("1")) {
			System.out.println("Coke를 선택하셨습니다.");
			if(inputMoney >= cokePrice) //사용자로부터 받은 금액이 음료의 가격보다 클 때
				System.out.printf("잔돈은 %d원입니다.\n", inputMoney - cokePrice);
			else//사용자로부터 받은 금액이 음료의 가격보다 작을 때
				System.out.printf("%d원 더 넣어주세요.\n", cokePrice - inputMoney);
		}
		else if(drinkSelected.equals("2")) {
			System.out.println("Lemonade를 선택하셨습니다.");
			if(inputMoney >= lemonadePrice)
				System.out.printf("잔돈은 %d원입니다.\n", inputMoney - lemonadePrice);
			else
				System.out.printf("%d원 더 넣어주세요.\n", lemonadePrice - inputMoney);
		}else if(drinkSelected.equals("3")){
			System.out.println("Coffee를 선택하셨습니다.");
			if(inputMoney >= coffeePrice)
				System.out.printf("잔돈은 %d원입니다.\n", inputMoney - coffeePrice);
			else
				System.out.printf("%d원 더 넣어주세요.\n", coffeePrice - inputMoney);
		}
			else //없는 메뉴를 선택했을 때
				System.out.println("없는 메뉴를 선택하셨습니다.");
	}

	
}
