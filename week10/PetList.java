//예제5

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Pet {
	String name;
	public String toString() {
		return name;
	}
}

class Dog extends Pet{
	Dog() {}
	Dog(String str) {
		name = str;
	}
}

class Cat extends Pet{
	Cat() {}
	Cat(String str) {
		name = str;
	}
}

class Bird extends Pet{
	Bird() {}
	Bird(String str) {
		name = str;
	}
}

class Hamster extends Pet{
	Hamster() {}
	Hamster(String str) {
		name = str;
	}
}

public class PetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pet> petList = new LinkedList<Pet>(); //LinkedList
		
		petList.add(new Dog("Doggy1")); //add()
		petList.add(new Dog("Doggy2"));
		petList.add(new Cat("Kitty"));
		
		output(petList);
		
		Bird b = new Bird();
		petList.add(b);
		
		output(petList);
		
		petList.add(new Cat("Kitty2"));
		petList.add(new Bird("Birdy"));
		
		output(petList);
		
		petList.remove(1); //remove()
		
		output(petList);
	}

	public static void output(List<Pet> p) { //Iterator 사용
		System.out.println("<OUTPUT>");
		int i = 1;
		
		Iterator<Pet> it = p.iterator(); //중요!!!
		while(it.hasNext()) //hasNext()
			System.out.println("Pet " + (i++) + ":" + it.next()); //next()
		
	}
	/*
	public static void output(List<Pet> p) {
		System.out.println("<OUTPUT>");
		for(int i = 0; i < p.size(); i++) { //size()
			System.out.println("Pet " + (i + 1) + ":" + p.get(i)); //get()
		}
	}
	*/

}
