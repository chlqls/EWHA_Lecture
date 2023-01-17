import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		
		try {
			socket = new Socket("10.200.13.167", 9001);
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
