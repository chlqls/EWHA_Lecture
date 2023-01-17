//예제5-7

import java.util.Scanner;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		
		System.out.println("곡은 몇개입니까?");
		
		int num = kbd.nextInt();
		kbd.nextLine();
		
//		String title, singer;
		Song[] s = new Song[num];
		
		
		System.out.println("<<곡 정보 입력>>");
		for(int i = 0; i < s.length; i++) {
			s[i] = new Song();
			System.out.print("곡명: ");
			s[i].title = kbd.nextLine();
			System.out.print("가수명: ");
			s[i].singer = kbd.nextLine();
			System.out.println("");
			
		}
		
		System.out.println("<<Song 정보>>");
		for(int i = 0; i < s.length; i++)
			s[i].playIt();
		
	}

}
