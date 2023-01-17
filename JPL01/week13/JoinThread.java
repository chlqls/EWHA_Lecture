//예제9
 
class TestThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.println("Hello");
	}
}

public class JoinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThread thread1 = new TestThread();
		thread1.start();
		try {
			thread1.join();
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Bye bye");

	}

}
