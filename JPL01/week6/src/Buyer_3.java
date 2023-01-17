//예제7

class Product3 {
	int price;
	int bonusPoint;
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product3 {
	Tv3() {
		super(100);
	}
	public String toString() { //오버라이딩
		return "Tv";
	}
}

class Computer3 extends Product3 {
	Computer3() {
		super(200);
	}
	public String toString() { //오버라이딩
		return "Computer";
	}
}

class Audio3 extends Product3 {
	Audio3() {
		super(50);
	}
	public String toString() { //오버라이딩
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product3 pd) {
		if(pd.price > money) {
			System.out.println("Mony is not enough.\n");
			System.exit(0);
		}
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
	}
}


public class Buyer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer3 Buyer1 = new Buyer3();
		Product3 pd[] = new Product3[3];
		
		pd[0] = new Tv3();
		pd[1] = new Computer3();
		pd[2] = new Audio3();
		
		for(int i = 0; i < 3; i++) {
			Buyer1.buy(pd[i]);
			
			System.out.println(pd[i]);
			System.out.println("Cost: " + pd[i].price);
		}
		
		System.out.println("\nMoney left: " + Buyer1.money);
		System.out.println("Current bonus point: " + Buyer1.bonusPoint);
		
	}

}
