//예제2
 
class Mythread2 implements Runnable {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch(InterruptedException e ) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Lab_Runnable extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Mythread2());
		thread.start();
		for(char ch = '!'; ch <= '/'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
	
		}
	}

}
