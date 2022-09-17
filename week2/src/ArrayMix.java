//¿¹Á¦ 5
public class ArrayMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[10];
		int i, n, temp;
		System.out.println("<Original Array>");
		
		for(i = 0; i < 10; i++)
		{
			number[i] = i;
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		for(i = 0; i < 100; i++)
		{
			n = (int)(Math.random()*10);
			temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		System.out.println("\n<Mixed Array>");
		
		for(i = 0; i < 10; i++)
			System.out.print(number[i] + " ");
	}

}
