import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week4_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		int a = 3, b = 5;
		double da = 1.2, db = 3.4;
		char c1 = 'x', c2 = 'y';
		int i_arr[] = {2, 5, 3}; // 배열 선언과 동시에 초기화하는 방법
		double d_arr[] = {1.5, 3.6, 7.23};
		char c_arr[] = {'f','r','i','e','n','d'};
		String s_arr[] = {"I", "love","you"};
		System.out.println(a + "+" + b + "=" + sum(a,b));
		System.out.println(da + "+" + db + "=" + sum(da,db));
		System.out.println(c1 + "+" + c2 + "=" + sum(c1,c2)); // “xy” 반환
		System.out.println("sum of int array: " + sum(i_arr)); // 모든 배열원소의 합
		System.out.println("sum of double array: " + sum(d_arr));
		System.out.println("sum of char array: " + sum(c_arr)); // 모든 문자 연결
		System.out.println("sum of String array: " + sum(s_arr)); // 모든 문자열 연결
	} // End of main
	
	
	//static 메서드인 main 메서드가 인스턴스메서드를 호출할 수 없기 때문에 모두 static 메서드로 오버로딩한다.
	
	static int sum(int a, int b) { //두 int 변수의 합을 구하는 static 메서드 정의
		return a + b;
	}

	static double sum(double da, double db) { //두 double 변수의 합을 구하는 static 메서드 오버로딩
		return da + db;
	}
	
	static String sum(char c1, char c2) { // 두 char 변수를 나란히 반환하는 static 메서드 오버로딩
		String result = ""; //반환할 지역변수 초기화
		result += c1; //result에 문자 c1 연결
		result += c2;
		
		return result;
	}
	
	static int sum(int[] arr) { //int 배열의 모든 원소의 합을 구하는 static 메서드 오버로딩
		int result = 0;
		for(int i = 0; i < arr.length; i++) { //for문을 이용해서 반복을 통해 원소의 합 구함
			result += arr[i];
		}
		return result;
	}
	
	static double sum(double[] arr) { //double 배열의 모든 원소의 합을 구하는 static 메서드 오버로딩
		double result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	static String sum(char[] arr) { //char 배열의 모든 문자를 연결하는 static 메서드 오버로딩
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	static String sum(String[] arr) { //String 배열의 모든 문자열을 연결하고 원소의 중간중간에 공백을 넣는 static 메서드 오버로딩
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			result += " ";
		}
		return result;
	}
	
}


