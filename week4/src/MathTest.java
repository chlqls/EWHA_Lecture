//예제4-5

class MyMath2 {
	long a, b;
	
	long add() {
		return a + b;
	}
	
	static long add(long a, long b) {
		return a + b;
	}
}


public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MyMath2.add(200L, 100L));
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
	}

}
