import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week8_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");

		Game g = new Game(); //Game 인스턴스생성하고 참조변수에 연결
		
		g.play(); //g의 play 메서드 호출
	}

}


class Game {
	
	int com, user; //랜덤으로 정해지는 컴퓨터 값과 사용자 입력값 저장할 변수
	int comCount, userCount; //컴퓨터와 사용자 각각 이긴 횟수
	
	public void play() {

		System.out.println("가위바위보 게임을 시작합니다.");
		
		while(comCount < 3 && userCount < 3) { //컴퓨터나 사용자 중 한쪽이 먼저 3번 이기면 게임 종료
			System.out.println("\n당신의 선택은?(You(" + userCount + ") - Com (" + comCount + "))");
			System.out.println("가위(1) 바위(2) 보(3)");
			
			input();
			
		}
		
		System.out.println("\nYou(" + userCount + ")\tCom (" + comCount + ")"); //최종 결과 출력
		if(comCount == 3 ) //이긴횟수를 비교해서 누가 이겼는지 확인
			System.out.println("컴퓨터가 이겼습니다.");
		else
			System.out.println("당신이 이겼습니다.");
		System.out.println("게임을 종료합니다.");
		
	}
	
	public void input() {

		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		try { 
			user = kbd.nextInt(); 
			if(user <= 0 || user >= 4) //사용자가 1,2,3이 아닌 수를 입력하면 프로그래머가 새로 정의한 예외로 예외처리
				throw new OutOfRangeException();
			
			com = (int)(Math.random()*10) % 3 + 1; //random()매서드를 사용해서 컴퓨터 선택값 설정

			System.out.println("<You>\t<Com>");

			if(user == 1) //You와 Computer가 각각 무엇을 냈는지 보여주기
				System.out.print("가위\t");
			else if(user == 2)
				System.out.print("바위\t");
			else if(user == 3)
				System.out.print("보\t");
			
			if(com == 1)
				System.out.println("가위\t");
			else if(com == 2)
				System.out.println("바위\t");
			else if(com == 3)
				System.out.println("보\t");
			
			writeOutPut();
		} 		
		catch (OutOfRangeException e) { //사용자가 1,2,3이 아닌 숫자를 입력했을 때의 예외처리
			System.out.println("범위가 잘못되었습니다.");
		}
		catch (Exception e) { //사용자가 숫자가 아닌 다른 문자를 입력했을 떄의 예외처리(더 자세한 catch 블록이 먼저 나오도록 순서 주의)
			System.out.println("범위가 잘못되었습니다.");
		}
		
	}
	
	public void writeOutPut() {
		if(com == user + 1 || com == user - 2) { //com이 user보다 1 크거나 2 작으면 com의 승
			System.out.println("컴퓨터 승");
			comCount++; //컴퓨터 이긴 횟수 1 추가
		}
		else if(com == user) //com과 user가 같으면 비김
			System.out.println("비김");
		else { //이외이 모든 경우는 사용자 승
			System.out.println("당신 승");
			userCount++; //사용자 이긴 횟수 1 추가
		}
	}
	
}

class OutOfRangeException extends Exception { //Exception 클래스를 상속받아서 새로운 예외 클래스 정의
	OutOfRangeException() {}
	OutOfRangeException(String str){
		super(str);
	}
}