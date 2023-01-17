import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReceiverThread extends Thread{
	Socket socket = null;
	
	ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			Scanner in = new Scanner(socket.getInputStream());
			while(true) {
				String str = in.nextLine();
				if(str == null) break;
				System.out.println("Rec> " + str);
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("Chatting finished");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("End of Chatting");
		}
	}
}