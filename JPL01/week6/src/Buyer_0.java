//예제5

class Tv1 {
	int price;
	int bonusPoint;
	
	Tv1() {
		price = 100;
		bonusPoint = (int)(price/10.0);
	}
	
	public String toString() { //오버라이딩
		return "Tv";
	}
}

class Computer1 {
	int price;
	int bonusPoint;
	
	Computer1() {
		price = 200;
		bonusPoint = (int)(price/10.0);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio1 {
	int price;
	int bonusPoint;
	
	Audio1() {
		price = 50;
		bonusPoint = (int)(price/10.0);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer1 {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Tv1 t) {
		money = money - t.price;
		bonusPoint = bonusPoint + t.bonusPoint;
	}
	void buy(Computer1 c) {
		money = money - c.price;
		bonusPoint = bonusPoint + c.bonusPoint;
	}
	void buy(Audio1 a) {
		money = money - a.price;
		bonusPoint = bonusPoint + a.bonusPoint;
	}
}


public class Buyer_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer1 Buyer1 = new Buyer1();
		Tv1 tv = new Tv1();
		Computer1 cp = new Computer1();
		Audio1 ad = new Audio1();
		
		Buyer1.buy(tv);
		Buyer1.buy(cp);
		Buyer1.buy(ad);
		
		System.out.println(tv); //Tv class 에서 toString 오버라이딩 안하면 Tv@73a28541 / 오버라이딩 하면 Tv 출력
		System.out.println(tv.toString()); //위와 마찬가지(toString 자동 생성되기때문)
		
		
		System.out.println("Money: " + Buyer1.money);
		System.out.println("Bonus Point: " + Buyer1.bonusPoint);
		

	}

}
