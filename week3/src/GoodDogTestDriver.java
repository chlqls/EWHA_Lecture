
public class GoodDogTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodDog one = new GoodDog();
		
		one.setSize(30);
		one.setSize(0);//변경안됨
		
		one.bark(3);
		
//		one.size = 10; //에러
		
		System.out.println("Dog one: " + one.getSize());

	}

}
