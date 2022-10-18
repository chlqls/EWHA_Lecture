//예제2
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unit[] group = new Unit[4];
		group [0] = new Marine();
		group [1] = new Tank();
		group [2] = new Marine();
		group [3] = new Dropship();
		
		for(int i = 0; i < group.length; i++) {
			System.out.println("x = " + group[i].x + " y = " + group[i].y); //주의!!!!!! 10, 20이 아니라 1, 2가 출력됨 (다형성떄문) / x, y,는 참조변수인 Unit(부모)의 값을 인쇄
			group[i].move(100, 200);
		}
	}

}


abstract class Unit {
	int x = 1, y = 2; 
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit {
	int x = 10, y = 20; // 사용하지 않음 -> 수정해야될 부분
	void move(int x, int y) {
		System.out.println("해병대 (" + x + "," + y + ") 지점으로 이동!");
	}
	
	void stimPack() {
		//내용생략
	}
}

class Tank extends Unit {
	int x = 10, y = 20; // 사용하지 않음 -> 수정해야될 부분
	void move(int x, int y) {
		System.out.println("탱크 (" + x + "," + y + ") 지점으로 이동!");
	}
	
	void changeMode() {
		//내용생략
	}
}

class Dropship extends Unit {
	int x = 10, y = 20; // 사용하지 않음 -> 수정해야될 부분
	void move(int x, int y) {
		System.out.println("수송선 (" + x + "," + y + ") 지점으로 이동!");
	}
	
	void load() {
		//내용생략
	}
	void unload() {
		//내용생략
	}
}