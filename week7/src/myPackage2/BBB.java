//예제1

package myPackage2;

public class BBB extends myPackage1.AAA{
	public void output() {
		System.out.println(pub_a);
		System.out.println(pro_b); // AAA를 상속받아서 다른패키지여도 접근 가능
//		System.out.println(def_c); // default는 같은 패키지 안에서만
//		System.out.println(pri_d); // private라 당연 오류
		System.out.println(pub_a); //public이라 가능
	}
}
