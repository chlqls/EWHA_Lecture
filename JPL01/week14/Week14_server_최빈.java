import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Week14_server_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
	
		//ServerSocket와 Socket 참조변수 선언
		ServerSocket serverSocket = null; 
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9002); //serverSocket 생성하여 9002번 포트 열어서 connection request 기다림
			socket = serverSocket.accept(); //client의 request 받아들여서 socket 생성하고 client와 연결
			
			Scanner in = new Scanner(socket.getInputStream()); //client로부터 String 받기위해 사용
			PrintWriter out = new PrintWriter(socket.getOutputStream()); //client에 String 보내기위해 사용
			
			//client로부터 "Hello?" 받고 출력
			String strIn = in.nextLine();
			System.out.println(strIn);
			
			//다음 문장 client에 보내기
			out.println("How many numbers?");
			out.flush();
			
			//client로부터 n 입력받고 Integer.parseInt() 사용하여 String 값을 정수로 변환 
			strIn = in.nextLine();
			System.out.println(strIn);
			int num = Integer.parseInt(strIn);
			
			//다음 문장 client에 보내기
			out.println("Input " + num + " numbers");
			out.flush();
			
			int sum = 0;
			
			//n번만큼 client에서 보낸 정수 받아서 sum에 더하기 
			for(int i = 0; i < num; i++) {
				strIn = in.nextLine();
				int numIn = Integer.parseInt(strIn);
				sum += numIn;
			}
			
			double avg = (double)sum / num;
			
			//client에 sum과 average 계산 결과 보내기
			out.println("Sum : " + sum);
			out.println("Avg : " + avg);
			out.flush();
			
			System.out.println("Service finished.");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close(); //사용한 socket 닫기
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				serverSocket.close(); //사용한 serverSocket 닫기
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
