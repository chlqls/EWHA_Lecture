//���� 3
public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA: //�ݺ��� �տ� label ����
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 3) break AA; // label AA�� ���� �ݺ��� ����� ����������
				System.out.println("Value ofi is " + i + ", value of j is " + j);
			}
		}
	}

}
