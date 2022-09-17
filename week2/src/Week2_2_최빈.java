import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week2_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		String degree; 		
		String input = "Y";
		int f;
		double c;

		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		
		while(input.equalsIgnoreCase("Y")) //input 값이 'y','Y'이면 반복문 실행. 아니면 빠져나감
		{
			
			System.out.print("섭씨의경우 'C', 화씨의경우 'F' 입력: ");
			degree = kbd.nextLine(); 
		
			
			while(!degree.equalsIgnoreCase("c")&&!degree.equalsIgnoreCase("f")) //'C','c','F','f'가 아닌 다른 문자 입력한 경우
			{
				System.out.println("잘못된 입력");
				break;
			}
			
			if(degree.equalsIgnoreCase("c")) //'C','c' 입력한 경우
			{
				System.out.print("섭씨온도 입력: ");
				c = kbd.nextDouble();
				kbd.nextLine(); //버퍼에 남아있는 엔터 해결
				
				f = (int) (9 * c / 5 + 32); //double로 입력받은 c를 포함해서 계산하고 int로 형변환하여 f에 대입
				
				System.out.printf("현재온도는 섭씨 %.1f도, 화씨 %d도입니다.", c, f); //printf를 사용해서 int인 값과 float인 값 출력
				System.out.println();
			}
			
			if(degree.equalsIgnoreCase("f"))
			{
				System.out.print("화씨온도 입력: ");
				f = kbd.nextInt();
				kbd.nextLine(); //버퍼에 남아있는 엔터 해결
				
				c = (double)5 / 9 * (f - 32); // 5를 int에서 double로 형변환 시켜준 뒤 나머지 계산하면 최종 값의 타입이 float가 됨
				
				System.out.printf("현재온도는 화씨 %d도, 섭씨 %.1f도입니다.", f, c); 
				System.out.println();
			}
			
			
			System.out.print("계속하시겠습니까? (Y/N)");
			
			input = kbd.nextLine(); 
			
		}
		
		System.out.println("프로그램종료");
	}

}
