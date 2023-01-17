import java.util.Scanner; //키보드입력을 위해 필요한 코드

class DiceGame { //DiceGame 클래스 생성
	private int diceFace; //멤버변수 선언
	private int userGuess;
	
	Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
	
	private int rollDice() {
		return (int)(Math.random()*10) % 6 + 1; //Math 클래스의 random메서드를 이용하여 랜덤한 주사위 눈 반환
	}
	
	private void setUserInput() {
		int input = kbd.nextInt(); //사용자로부터 추측되는 수를 입력받음
		while(input < 1 || input > 6) { // 입력받은 주사위 눈 범위 확인해서 범위 만족할 때까지 입력받음
			System.out.println("Input number between 1~6.");
			input = kbd.nextInt();
		}
		
		userGuess = input; //userGuess에 저장
	}
	
	private void ckeckUserGuess() {
		if(diceFace == userGuess) { //diceFace와 userGuess가 같은 값인지 확인
			System.out.println("Bingo!!!");
		}
		else {
			System.out.println("Wrong!");
			System.out.println("The face was " + diceFace);
		}
			
	}
	
	public void startPlaying() {
		System.out.println("<< GAME START >>");
		diceFace = rollDice(); //rollDice()에서 반환되는 값 diceFace에 저장
		System.out.println("Dice is rolled!!!");
		System.out.println("Guess the number! What do you think?");
		setUserInput(); //userGuess 값 설정
		ckeckUserGuess(); //결과 출력
	}
	
	
}



public class HW1_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============"); //주석으로 쓰는거??? 따로 출력안하고??
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");

		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		DiceGame diceGame = new DiceGame(); // DiceGame 클래스의 인스턴스 생성
		
		String check = "Y"; //반복여부 확인을 위한 변수
		
		while (!check.equalsIgnoreCase("n")) { //check가 n 또는 N이면 프로그램 종료
			diceGame.startPlaying(); //diceGame의 startPlaying메서드 실행

			System.out.println("Try again?(y/n)"); //반복여부 확인
			check = kbd.nextLine();
			System.out.println();
		}
		
		System.out.println("Game finished.");
	}

}

		
