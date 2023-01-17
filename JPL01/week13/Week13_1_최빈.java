import java.util.Scanner;

class SharedArea_1 {
	double ratio;
	boolean isReady;
}

public class Week13_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("Input the number of coin toss : ");
		int N = kbd.nextInt(); //반복 횟수 입력받음

		PrintThread thread1 = new PrintThread();
		SimulThread thread2 = new SimulThread(N); //입력받은 N을 SimulThread 생성자에 전달
				
		SharedArea_1 SH = new SharedArea_1();
		
		thread1.sharedArea = SH; //thread1,2의 sharedArea에 SH 저장 
		thread2.sharedArea = SH;
		
		thread1.start();  //Thread 시작
		thread2.start();
		
	}
}

class PrintThread extends Thread {//시뮬레이션 결과 출력 Thread
	SharedArea_1 sharedArea;
	
	public void run() {
		if(sharedArea.isReady != true) { //isReady가 false인 경우에만 수행
			try {
				synchronized(sharedArea) {//반드시 synchronized 블록 내에서 실행되어야 함
					sharedArea.wait(); //wait상태로 들어가고 다른 thread로부터 신호를 기다림
				}
			} catch(InterruptedException e) { //wait()메서드 사용으로 인한 exception handling
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("Front Ratio : %.2f%%", sharedArea.ratio);
	}
}

class SimulThread extends Thread {
	SharedArea_1 sharedArea;
	int N;
	
	SimulThread(int N) { //생성자
		this.N = N;
	}
	
	public void run() {
		int front = 0; //앞면이 나온 횟수
		for(int i = 0; i < N; i++) {
			if(Math.round(Math.random()) == 0) { //Math.round()메서드를 사용하여 랜덤으로 생성된 값을 반올림했을 때 0이면 앞면이라고 가정한다
				front++;
			}
		}

		sharedArea.ratio = (double)front / N * 100; //앞면이 나온 횟수를 전체 동전 던진 횟수 N으로 나누고 100을 곱해줘서 확률(%)을 구하고 sharedArea의 ratio에 저장한다
		sharedArea.isReady = true; //수행이 모두 완료되었기 때문에 isReady를 true로 설정
		synchronized(sharedArea) {
			sharedArea.notify(); // wait 상태의 thread 중 하나를 깨운다
		}
	}
}

