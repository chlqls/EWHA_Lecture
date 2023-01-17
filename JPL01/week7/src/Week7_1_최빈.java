import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week7_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Pet pet[] = new Pet[10]; // Pet 참조변수배열(최대크기 10)을 생성		

		int i = 0; //반복문을 이용해서 배열에 새로운 값을 저장하기 위해 필요한 변수
		
		while(true) { //무한반복
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input  2. Output  3.  Exit");
			int select = kbd.nextInt(); //사용자로부터 select값을 입력받음
			
			if(select == 1) { //select 입력값이 1이면 배열에 새로운 pet 저장
				System.out.println("종은 무엇입니까?");
				System.out.println("1. Dog  2. Cat  3. Snake  4. Bird");
				int species = kbd.nextInt(); //사용자로부터 species값을 입력받음
				
				if(species >= 1 && species <= 4) { //species가 1~4일 때만 name,age입력받고 인스턴스 생성하고 배열에 저장
					kbd.nextLine();
					System.out.print("Name: ");
					String name = kbd.nextLine();
					System.out.print("Age: ");
					int age = kbd.nextInt();

					if(species == 1) //species 값에 따라 입력받은 name과 age로 만드는 자손클래스의 인스턴스 종류가 달라짐
						pet[i] = new Dog(name, age);//예를 들어 species가 1이면 입력받은 name과 age로 Dog 인스턴스를 생성하고 Pet배열에 연결
					else if(species == 2)
						pet[i] = new Cat(name, age);
					else if(species == 3)
						pet[i] = new Snake(name, age);
					else if(species == 4)
						pet[i] = new Bird(name, age);
					i++; // 다음번에는 다음 배열에 넣기 위해 i에 1 추가
				}
				else//species 입력값이 0~3이 아니라면 다음과 같은 문장 출력
					System.out.println("잘못된 입력");
			}
			
			else if(select == 2) { //select 입력값이 2면 반복문 이용해서 배열에 저장된 값 정리해서 출력하기
				System.out.println("Species\tName\tAge\tMovement");
				for(int j = 0; j < i; j++) {
					System.out.print(pet[j].species + "\t" + pet[j].name + "\t" + pet[j].age + "\t");
					pet[j].move();
				}
			}
	
			else if(select == 3) {//select 입력값이 3이면 반복문 끝냄
				break;
			}
			
			else { //select 입력값이 1~3이 아니라면 다음과 같은 문장 출력
				System.out.println("잘못된 입력");
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}

abstract class Pet { //추상클래스인 Pet클래스 생성
	public String species;
	public String name;
	public int age;
	
	public abstract void move(); //추상메서드이므로 선언만 하고 body부분이 없음. 그리고 반드시 추상클래스 안에 있어야함.
}

class Dog extends Pet {	//Pet class의 자식인 Dog class 생성 
	Dog(String name, int age) { //name과 age를 매개변수로 받는 생성자
		this.species = "Dog"; //생성자를 통해 species, name, age를 초기화
		this.name = name;
		this.age = age;
	}
	
	public void move() { //추상메서드의 구현부 완성 (자손마다 다르게 구현)
		System.out.println("run");
	}
}

class Cat extends Pet {	//Pet class의 자식인 Dog class 생성
	Cat(String name, int age) { //Cat Bird Snake 클래스에 대한 설명은 Dog클래스와 완전히 동일하여 생략함
		this.species = "Cat";
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println("jump");
	}
}

class Bird extends Pet { //Pet class의 자식인 Dog class 생성
	Bird(String name, int age) { 
		this.species = "Bird";
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println("fly");
	}
}

class Snake extends Pet { //Pet class의 자식인 Dog class 생성
	Snake(String name, int age) { 
		this.species = "Snake";
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println("crawl");
	}
}