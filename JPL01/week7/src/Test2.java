//예제3
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter f = new Fighter();
		if(f instanceof Unit2) { // true
			System.out.println("f는 Unit클래스의 자식");
		}
		if(f instanceof Fightable) { // true
			System.out.println("f는 Fightable인터페이스를 구현");
		}
		if(f instanceof Movable) { // true
			System.out.println("f는 Movable인터페이스를 구현");
		}
		if(f instanceof Attackable) { // true
			System.out.println("f는 Attackable인터페이스를 구현");
		}
		if(f instanceof Object) { // true
			System.out.println("f는 Object클래스의 자식\n");
		}
		
		f.move(100, 200);
		f.attack(new Unit2()); //부대! 공격!!!
	}

}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) {
		System.out.println("위치(" + x + ", " + y + ")로 이동하랏!");
	}
	public void attack(Unit2 u) {
		System.out.println(u + " 공격!!!");
	}
}

class Unit2 {
	int currentHP;
	int x;
	int y;
	public String toString() {
		return "부대!";
	}
}

interface Fightable extends Movable, Attackable {}
interface Movable {
	void move(int x, int y);
}
interface Attackable {
	void attack(Unit2 u);
}