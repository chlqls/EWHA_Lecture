//예제2
class Car1{
	String color;
	int door;
	void drive() {
		System.out.println("Brrrrrrr!");
	}
	void stop() {
		System.out.println("Stop!");
	}
}

class FireEngine1 extends Car1 {
	void water() {
		System.out.println("water!");
	}
}

class Ambulance1 extends Car1 {
	void siren() {
		System.out.println("siren~");
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car1 car = null;
		FireEngine1 fe = new FireEngine1();
		FireEngine1 fe2 = null;
		
		fe.water();
		car =fe;
//		car.water();
		fe2=(FireEngine1)car;
		fe2.water();
	}

}
