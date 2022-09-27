//예제 4-3

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		Car c2 = new Car(c1);
		Car c3 = new Car();
		
		c3 = c1;
		
		System.out.println("c1의 color = " + c1.color + ", geatType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", geatType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", geatType = " + c3.gearType + ", door = " + c3.door);
		
		c1.door = 100;
		System.out.println("c1.door = 100; 수행 후");
		
		System.out.println("c1의 color = " + c1.color + ", geatType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", geatType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", geatType = " + c3.gearType + ", door = " + c3.door);

		
	}

}
