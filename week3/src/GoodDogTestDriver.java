
public class GoodDogTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodDog one = new GoodDog();
		
		one.setSize(30);
		one.setSize(0);//����ȵ�
		
		one.bark(3);
		
//		one.size = 10; //����
		
		System.out.println("Dog one: " + one.getSize());

	}

}
