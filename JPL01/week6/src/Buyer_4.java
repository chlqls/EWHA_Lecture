//예제8

class Product4 {
	int price;
	int bonusPoint;
	Product4(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv4 extends Product4 {
	Tv4() {
		super(100);
	}
	public String toString() { //오버라이딩
		return "Tv";
	}
}

class Computer4 extends Product4 {
	Computer4() {
		super(200);
	}
	public String toString() { //오버라이딩
		return "Computer";
	}
}

class Audio4 extends Product4 {
	Audio4() {
		super(50);
	}
	public String toString() { //오버라이딩
		return "Audio";
	}
}

class Buyer4 {
	int money = 1000, i;
	int bonusPoint = 0;
	Product4 item[] = new Product4[10];
	
	void buy(Product4 pd) {
		if(pd.price > money) {
			System.out.println("Money is not enough.\n");
			System.exit(0);
		}
		System.out.println("You bought " + pd + "(" + pd.price + ")");
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
		item[i++] = pd;
	}
	
	void summary() {
		System.out.print("Shopping list: ");
		for(int j = 0; j < i; j++) 
			System.out.print(item[j] + " ");
		System.out.println("\nMoney left: " + money);
		System.out.println("Current bonus point: " + bonusPoint);
	}
}
public class Buyer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer4 Buyer1 = new Buyer4();
		
		Tv4 t = new Tv4();
		Computer4 c = new Computer4();
		Audio4 a = new Audio4();
		
		Buyer1.buy(t);
		Buyer1.buy(c);
		Buyer1.buy(a);
		
		Buyer1.summary();
		

	}

}
