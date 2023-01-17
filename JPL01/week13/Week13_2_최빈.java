import javax.swing.JOptionPane;

class SharedArea_2 { //랜덤하게 출력된 단어 저장하는 SharedArea
	String str;
}

public class Week13_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		SharedArea_2 SH = new SharedArea_2(); 
		StringThread th = new StringThread();
		
		th.sharedArea = SH; //th에 SH 주소 넘겨줌
		th.start(); //Thread 시작

		while(true) { //무한반복
			String st = JOptionPane.showInputDialog("문자열 입력"); //JOptionPane을 이용해서 문자열 입력하는 창 만들고 입력받은 문자열을 st에 저장
			System.out.println("<" + st + ">을 입력하셨습니다."); //입력받은 문자열 출력
			if(st.equalsIgnoreCase(SH.str)) { //SharedArea(SH)에 저장된 str와 입력받은 문자열(st)이 같은 경우
				System.out.println("성공!");
				th.setStop(true); //th의 stop을 true로 설정
				System.out.println("Timer is stopped.");
				break; //반복문 빠져나가고 프로그램 종료
			}
		}
	}
}


class StringThread extends Thread {
	SharedArea_2 sharedArea;
	boolean stop; //false로 초기화
	
	public void setStop(boolean stop){ //stop값을 설정하는 메서드
		this.stop = stop;
	}
	//string 배열을 사용하여 3글자 이상의 단어를 초기화(최소 15개 이상)
	String[] strArray = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};
	
	public void run() { //오버라이딩
		for(int i = 20; i > 0; i--) { //20번 반복
			if(this.stop == true) { //boolean 타입인 stop을 이용해서 해당 Thread가 스스로 끝낼 수 있게 코드로 제어
				break;
			}
			//배열에 저장된 단어 중 1초당 1개씩 랜덤하게 출력
			String str = strArray[(int)(Math.random() * 15)]; 
			System.out.println(str);
			
			sharedArea.str = str;//sharedArea에도 현재 str저장 (1초마다 저장)
			
			try { //sleep()메서드 사용할 때는 exception handling해야함
				sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		if(this.stop != true) {
			System.out.println("실패");
			System.exit(0); //실패하면 프로그램 종료
		}
	}
}


