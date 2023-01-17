import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner; //키보드입력을 위해 필요한 코드



class Pet implements Serializable { //Serializable 인터페이스를 구현하는 Pet 클래스 생성
	
	private String name; //멤버변수 선언
	private int age;
	private double weight;
	
	public void setPet(String newName, int newAge, double newWeight) { //입력받은 매개변수들로 멤버변수 초기화하는 메서드
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}

	public String getName() { //private 변수들의 getter와 setter
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}

}


class Dog extends Pet implements Serializable { //Pet 클래스를 상속받고 Serializable 인터페이스를 구현하는 Dog 클래스 생성
	
	private String breed; //멤버변수 선언
	private boolean boosterShot;
	
	public Dog(String newName, int newAge, double newWeight, String breed, boolean boosterShot) { //상속받은 변수들과 Dog의 멤버변수들을 초기화하는 생성자
		setPet(newName, newAge, newWeight);
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	public Dog() {} //default 생성자
	
	public String getBreed() {//private 변수들의 getter와 setter
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean getBoosterShot() {
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	public String toString() { //toString 오버라이딩해서 dog 정보 출력
		String checkBoosterShot = "";
		if(boosterShot) //boosterShot이 true이면 O, false이면 X
			checkBoosterShot = "O";
		else
			checkBoosterShot = "X";
		return (super.getName() + "\t" + super.getAge() + "\t" + super.getWeight() + "\t" + breed + "\t\t" + checkBoosterShot);
	}
	
	
}


public class Week9_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음

		
		Dog[] myDog = new Dog[10]; //Dog배열 선언
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false); //각 배열에 Dog인스턴스 연결하고 초기화
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		
		System.out.println("Input File name to write Dog data");
		String fileName = kbd.nextLine(); //파일이름을 사용자에게 입력받음
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));//출력스트림 생성
			outputStream.writeObject(myDog); //파일에 myDog(Object) 쓰기
			outputStream.close(); // 출력스트림 close
		}
		catch(IOException e) { //input output의 전반적인 예외처리 담당
			System.out.println("ERROR writing to file " + fileName + ".");
			System.exit(0);
		}
		
		System.out.println("Name\tAge\tWeight\tBreed\t\tBoosterShot");
		
		Dog[] anotherArray = null; //myDog를 저장한 파일의 내용을 출력하기 위해 필요한 배열 선언
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); //입력스트림 생성
			anotherArray = (Dog[])inputStream.readObject(); //읽어온 object를 다운캐스팅하여 anotherArray에 저장
			for(int i = 0; i < myDog.length; i++) {
				System.out.println(anotherArray[i]);//반복문 이용해서 anotherArray 출력
			}
			
			System.out.println("\nDogs older than 2 years and did not get the boosterShot.");
			for(int i = 0; i < myDog.length; i++) {
				if(anotherArray[i].getAge() > 2 && !anotherArray[i].getBoosterShot()) //2세 초과이고 예방접종 안한 강아지의 이름과 종 출력
					System.out.println(anotherArray[i].getName() + "\t\t" + anotherArray[i].getBreed());
			}
			
			inputStream.close(); //입력스트림 닫기
		}
		catch(EOFException e) {//더이상 읽어올 데이터가 없을 때 발생하는 예외처리
			System.out.println("End of File Exception.");
		}
		catch(FileNotFoundException e) {//읽어올 파일이 없을 때 발생하는 예외처리
			System.out.println("File not Found Exception.");
		}
		catch(IOException e) {//input output의 전반적인 예외처리 담당
			System.out.println("IO Exception.");
		}
		catch(Exception e) { //마지막으로 Exception으로 전체 예외처리
			System.out.println("Exception.");
		}
				
		System.out.println("\nProgram finished");
		
		
	}

}


