//예제5-6
public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[3];
		int[] b = new int[3];
		
		setArray(a);
		setArray(b);
		
		if(b == a) 
			System.out.println("주소 동일");
		else
			System.out.println("주소 동일하지 않음");
		if(equals(b, a))
			System.out.println("배열요소 동일");
		else
			System.out.println("배열요소 동일하지 않음");
		
	}

	
	public static boolean equals(int[] a, int[] b) {
		boolean elementsMath = true;
		
		if(a.length != b.length)
			elementsMath = false;
		else {
			int i = 0;
			while (elementsMath && (i < a.length)) {
				if(a[i] != b[i])
					elementsMath = false;
				i++;
			}
		}
		return elementsMath;
	}
	
	
	public static void setArray(int[] array) {
		for(int i = 0; i < array.length; i++)
			array[i] = i;
	}
}
