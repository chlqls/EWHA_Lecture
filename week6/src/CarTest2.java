//예제3
class Car2{
	String color;
	int door;
	void drive() {
		System.out.println("Brrrrrrr!");
	}
	void stop() {
		System.out.println("Stop!");
	}
}

class FireEngine2 extends Car2 {
	void water() {
		System.out.println("water!");
	}
}

class Ambulance2 extends Car2 {
	void siren() {
		System.out.println("siren~");
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine2 fe = new FireEngine2();
		Ambulance2 am = new Ambulance2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("FIRE");
		}
		if(fe instanceof Car2) {
			System.out.println("CAR");
		}
		if(fe instanceof Object) {
			System.out.println("Object");
		}
		
		method(fe);
		method(am);
	}
	
	public static void method(Object obj) {
		if(obj instanceof FireEngine2) {
			FireEngine2 fe = (FireEngine2)obj;
			fe.water();
		}
		else if(obj instanceof Car2) {
			Car2 c = (Car2)obj;
			c.drive();
		}
	}

}
