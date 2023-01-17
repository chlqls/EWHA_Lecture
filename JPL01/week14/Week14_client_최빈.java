import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Week14_client_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
	
		Socket socket = null; //Socket 참조변수 선언
		
		try {
			socket = new Socket("10.200.13.167", 9002); //server의 ip주소와 port번호 사용하여 socket 생성하고 connection을 request 
			
			Scanner in = new Scanner(socket.getInputStream()); //server로부터 받는 Scanner
			Scanner kbd = new Scanner(System.in); //표준입력 Scanner
			PrintWriter out = new PrintWriter(socket.getOutputStream()); //server에 String 보내기위해 사용
			
			//server에 "Hello?" 보내기
			out.println("Hello?"); 
			out.flush();
			
			//server로부터 "How many numbers?" 받고 출력
			String strIn = in.nextLine();
			System.out.println(strIn);
			
			//숫자 입력해서 String 값으로 server에 보내기
			String str = kbd.nextLine();
			out.println(str);
			out.flush();
			int num = Integer.parseInt(str); //입력한 String 값을 정수(int)로 변환
			
			////server로부터 "Input n numbers" 받고 출력
			strIn = in.nextLine();
			System.out.println(strIn);
			
			//n개 정수 입력 받고 server에 보내기
			for(int i = 0; i < num; i++) {
				str = kbd.nextLine();
				out.println(str);
			}
			out.flush();
			
			//server로부터 sum과 average 계산 결과 받고 출력
			strIn = in.nextLine();
			System.out.println(strIn);
			strIn = in.nextLine();
			System.out.println(strIn);
			
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
		}
		
	}
}
