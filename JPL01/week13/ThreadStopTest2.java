//예제10_1

class Myth2 extends Thread {
	boolean stop;
	public void setStop(boolean s) {
		stop = s;
	}
	
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			if(stop == true) break;
			System.out.print(ch);
			try {
				Thread.sleep(10);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		}
	}
}


public class ThreadStopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myth2 th1 = new Myth2();
		th1.start();
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(10);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		}
//		th1.stop();
		th1.setStop(true);
	}
}
