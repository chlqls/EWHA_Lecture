import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week2_4_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		int height;
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.print("Enter the height of the triangle : ");
		height = kbd.nextInt(); //높이를 정수로 입력받음
		
		for(int i = 1; i <= height; i++) //높이인 height번만큼 반복함
		{
			for(int j = 1; j <= height - i; j++) // 주어진 그림처럼 나무 모양을 나타내기 위해 *기호 앞에 공백을 height - i 번만큼 입력
				System.out.print(" ");
			for(int j = 1; j <= i * 2 - 1; j++) // *기호를 i * 2 - 1 번만큼 입력
				System.out.print("*");
			System.out.println(); // 공백과 *기호를 한줄 모두 입력하면 다음줄로 넘어감
		}
		
	}

}