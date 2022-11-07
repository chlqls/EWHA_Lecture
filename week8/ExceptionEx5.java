// 예제1

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //예외 발생
			System.out.println(4); //실행X
		} catch (ArithmeticException ae) {
			System.out.println(5); //실행O
		}
		System.out.println(6); //언제나 실행
		
	}

}
