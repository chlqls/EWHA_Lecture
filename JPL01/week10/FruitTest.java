//예제4

import java.util.ArrayList;
import java.util.Scanner;

class Fruit {
	int price;
	Fruit(int price) {
		this.price = price;
	}
}

class Strawberry extends Fruit {
	Strawberry() {super(1000);}
	public String toString() {return "Strawberry";}
}

class Apple extends Fruit {
	Apple() {super(2000);}
	public String toString() {return "Apple";}
}

class Pear extends Fruit {
	Pear() {super(4000);}
	public String toString() {return "Pear";}
}

class Grape extends Fruit {
	Grape() {super(3500);}
	public String toString() {return "Grape";}
}

class Buyer {
	int money;
	public Buyer(int money) {this.money = money;}
	ArrayList <Fruit> myFruit = new ArrayList<Fruit>(); //ArrayList
	
	void buy(Fruit f) {
		myFruit.add(f); //add()
		money = money - f.price;
	}
	
	void pay() {
		System.out.println("\n<My Fruit Basket>");
		for(int j = 0; j < myFruit.size(); j++)
			System.out.println(myFruit.get(j) + "(" + myFruit.get(j).price + ")\t"); //get(),get().price
		
		if(money < 0) 
			System.out.println("\nYou need to pay " + money + "won more.");
		else
			System.out.println("\nYou have " + money + "won left.");
	}
}

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		System.out.println("How much money do you have?");
		int money = kbd.nextInt();
		System.out.println("You have " + money + "won.");
		
		Buyer b = new Buyer(money);
		Apple a = new Apple();
		Grape g = new Grape();
		Pear p = new Pear();
		Strawberry s = new Strawberry();
		
		b.buy(a);
		b.buy(s);
		b.buy(p);
		b.pay();
	}

}
