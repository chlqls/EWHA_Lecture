//예제10_1

class Myth extends Thread {
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(10);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		}
	}
}


public class ThreadStopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myth th1 = new Myth();
		th1.start();
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(10);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		}
	}
}
