import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week5_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		Dog[] d = new Dog[3]; //Dog배열과 Cat배열을 각 3개의 element를 갖도록 선언
		Cat[] c = new Cat[3];
		

		for(int i = 0; i < d.length; i++) { //각 인스턴스의 정보를 반복문을 이용하여 입력받음
			System.out.println("<<Dog " + (i+1) + ">>");
			d[i] = new Dog(); //인스턴스 생성
			
			System.out.print("Name: ");
			d[i].setName(kbd.nextLine());
			
			System.out.print("Age: ");
			d[i].setAge(kbd.nextInt());
			
			System.out.print("Weight :");
			d[i].setWeight(kbd.nextInt());
			kbd.nextLine(); //버퍼에 남아있는 엔터 해결
			
			System.out.print("BoosterShot(y/n) :");
			String answer = kbd.nextLine(); 
			if(answer.equalsIgnoreCase("y")) //answer값이 y또는 Y면 BoosterShot true
				d[i].setBoosterShot(true);
			else if(answer.equalsIgnoreCase("n")) //answer값이 n또는 N면 BoosterShot false
				d[i].setBoosterShot(false);			
			System.out.println();			
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("<<Cat " + (i+1) + ">>");
			c[i] = new Cat(); //인스턴스 생성
			
			System.out.print("Name: ");
			c[i].setName(kbd.nextLine());
			
			System.out.print("Age: ");
			c[i].setAge(kbd.nextInt());
			
			System.out.print("Weight :");
			c[i].setWeight(kbd.nextInt());
			kbd.nextLine();//버퍼에 남아있는 엔터 해결
			
			System.out.print("Color :");
			c[i].setColor(kbd.nextLine());				
			System.out.println();			
		}
		
		System.out.println("<<Dog List>>"); //각 인스턴스의 정보를 반복문을 이용하여 writeOutput() 메서드로 출력
		for(int i = 0; i < d.length; i++) {
			d[i].writeOutput(); //d[i]의 writeOutput실행
			d[i].move(); //d[i]의 move실행
			System.out.println();
		}
		
		System.out.println("<<Cat List>>");
		for(int i = 0; i < c.length; i++) {
			c[i].writeOutput();//c[i]의 writeOutput실행
			c[i].move();//c[i]의 move실행
			System.out.println();
		}
		
		System.out.println("* Dogs older than 2 years and no boostershot are..."); 
		for(int i = 0; i < d.length; i++) {
			if(d[i].getAge() > 2 && !d[i].getBoosterShot())//두 살보다 많고 예방접종하지 않은 dog 이름 출력
				System.out.print(d[i].getName() + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("* Black cats weighs more than 3Kg are...");
		for(int i = 0; i < c.length; i++) {
			if(c[i].getWeight() > 3 && c[i].getColor().equalsIgnoreCase("black"))//black이고 3kg 넘는 cat 이름 출력
				System.out.print(c[i].getName() + " ");
		}
		
		
		
	}

}


class Pet {//Pet클래스 생성

	Pet() {} //default 생성자 선언하기 
	
	private String name;//멤버변수 선언
	private int age;
	private double weight;
	
	public void writeOutput() { //name, age, weight 출력하는 writeOutput 메서드 정의
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}
	
	public void setPet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;		
	}
	
	public String getName() {//private 변수인 name, age, weight 의 getter, setter 메서드 정의
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void move() {
		System.out.println(name + " moves.");
	}
 	
	
}
	
class Dog extends Pet { //Pet클래스를 상속받는 Dog클래스 생성
	
	Dog() { super(); } //default 생성자 선언(자손의 생성자의 첫 문장에서 조상의 생성자를 호출)
		
	private boolean boosterShot; //멤버변수 선언
	
	public void writeOutput() { //조상클래스인 Pet의 writeOutput 메서드 오버라이딩(BoosterShot 출력을 추가함. 이때 BoosterShot가 true이면 O, false이면 X 반환)
		super.writeOutput();//조상클래스인 Pet의 writeOutput 실행
		System.out.print("BoosterShot: ");
		if(boosterShot)
			System.out.println("O");
		else
			System.out.println("X");
	}

	public boolean getBoosterShot() {//private 변수인 boosterShot의 getter, setter 메서드 정의
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot; 
	}
	
	public void move() { //조상클래스인 Pet의 move 메서드 오버라이딩(출력문구 바뀜)
		System.out.println(super.getName() + " walks and runs.");//Pet클래스의 private변수인 name에 super.getName()으로 접근
	}
	
}
	
	
class Cat extends Pet {//Pet클래스를 상속받는 Cat클래스 생성
	
	Cat() { super(); }//default 생성자 선언(자손의 생성자의 첫 문장에서 조상의 생성자를 호출)
	
	private String color;//멤버변수 선언
	
	public void writeOutput() { //조상클래스인 Pet의 writeOutput 메서드 오버라이딩(Color 출력을 추가함)
		super.writeOutput(); //조상클래스인 Pet의 writeOutput 실행
		System.out.println("Color: " + color);
	}

	public String getColor() {//private 변수인 color의 getter, setter 메서드 정의
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void move() { //조상클래스인 Pet의 move 메서드 오버라이딩(출력문구 바뀜)
		System.out.println(super.getName() + " creeps and jumps.");//Pet클래스의 private변수인 name에 super.getName()으로 접근
	}
	

}


	
	