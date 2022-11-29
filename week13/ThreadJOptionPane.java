import javax.swing.JOptionPane;

//예제4

class MyThread4 extends Thread {
	public void run() {
		for(int i = 20; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Time out");
	}
}

public class ThreadJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread4 th = new MyThread4();
		th.start();
		
		while(true) {
			String st = JOptionPane.showInputDialog("Enter a string");
			System.out.println("You entered <" + st + ">");
			if(st.equalsIgnoreCase("bye")) break;
		}

	}

}
