//예제6

class Product2 {
	int price;
	int bonusPoint;
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}
	public String toString() { //오버라이딩
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}
	public String toString() { //오버라이딩
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}
	public String toString() { //오버라이딩
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product2 pd) {
		if(pd.price > money) {
			System.out.println("Mony is not enough.\n");
			System.exit(0);
		}
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
	}
}

public class Buyer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer2 Buyer1 = new Buyer2();
		Product2 tv1 = new Tv2();
		Product2 cp1 = new Computer2();
		Product2 ad1 = new Audio2();
		
		Buyer1.buy(tv1);
		Buyer1.buy(cp1);
		Buyer1.buy(ad1);
		
		System.out.println(tv1.toString());
		System.out.println(tv1); //test
		System.out.println("Cost: " + tv1.price);
		System.out.println(cp1.toString());
		System.out.println("Cost: " + cp1.price);
		System.out.println(ad1.toString());
		System.out.println("Cost: " + ad1.price);
		
		System.out.println("\nMoney left: " + Buyer1.money);
		System.out.println("Current bonus point: " + Buyer1.bonusPoint);
		

	}

}
