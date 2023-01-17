
public class TestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		Dog2 d1 = new Dog2();
		Dog2 d2 = new Dog2();
		
		d1.setName("Happy");
		d2.setName("Dona");
		
		System.out.println("Before Change");
		System.out.println("a = " + a + " b = " + b);
		
		d1.run();
		d2.run();
		
		a = b;
		b = 30;
		
		d1 = d2;
		d2.setName("Dot");
		
		System.out.println("After Change");
		System.out.println();
		System.out.println("a = " + a + " b = " + b);
		d1.run();
		d2.run();

	}

}
