//예제1

package myPackage2;

public class CCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBB b = new BBB();
		System.out.println(b.pub_a); //public이라 접근 가능
//		System.out.println(b.pro_b); // protected라서 다른패키지에선 상속받은클래서에서만 접근가능
//		System.out.println(b.def_c); //default는 다른 패키지에서 접근 불가
//		System.out.println(b.pri_d); //private이라 접근 불가
		System.out.println(b.getD()); //public이라 접근 가능

	}

}
