//예제4

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent  {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		
	}

}
