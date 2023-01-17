// 예제1

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) { //예외 발생 안함
			System.out.println(5); //실행X
		}
		System.out.println(6); //언제나 실행
		
	}

}
