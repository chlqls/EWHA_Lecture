//예제 3
public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA: //반복문 앞에 label 지정
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 3) break AA; // label AA가 붙은 반복문 블록을 빠져나가라
				System.out.println("Value ofi is " + i + ", value of j is " + j);
			}
		}
	}

}
