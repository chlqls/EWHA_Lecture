//예제1

package myPackage1;

public class AAA {

	public String pub_a = "public_var";
	protected String pro_b = "protected_var";
	String def_c = "default_var";
	private String pri_d = "private_var";
	
	public String getD() { //private 타입인 pri_d를 다른 클래스에서 불러오기위한 메서드
		return pri_d;
	}
}
