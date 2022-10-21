import java.util.Scanner; //키보드입력을 위해 필요한 코드

class Time { //Time 클래스 생성
	private int hour; //멤버변수 선언
	private int minute;
	
	private boolean isValid(int hour, int minute) { //시와 분이 범위 내에 있는지 확인하는 메서드
		if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) //범위 확인
			return true;
		else
			return false;
	}
	
	public void setTime(int hour, int minute) { //매개변수로 받은 시와 분이 범위 내에 있으면 멤버변수인 hour,minute에 저장하는 메서드
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Wrong Input"); //범위 밖에 있으면 해당 문장 출력
		}
		
	}
	
	public int getHourOrMinute(char ch) { //ch에 따라 hour 또는 minute을 반환
		if(ch == 'H' || ch == 'h')
			return hour;
		else //if(ch == 'M' || ch == 'm')
			return minute;
	}
	
	
}



public class HW1_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============"); //주석으로 쓰는거??? 따로 출력안하고??
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		Time t = new Time(); // Time 클래스의 인스턴스 생성
		
		System.out.println("Hour:"); //사용자로부터 시,분 입력받기
		int hour = kbd.nextInt();
		System.out.println("Minute:");
		int minute = kbd.nextInt();
		
		t.setTime(hour, minute); // t의 setTime으로 시간 저장
		
		System.out.println(t.getHourOrMinute('H') + ":" + t.getHourOrMinute('M')); // 입력한 시간 출력
		
	}

}

		
