//예제1
 
class Mythread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.print(i);
	}
}

public class Lab_thread0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread thread = new Mythread();
		thread.start();
		for(char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);

	}

}
