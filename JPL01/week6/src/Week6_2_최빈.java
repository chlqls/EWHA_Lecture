import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week6_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		Car car = null; //객체를 생성하지않고 참조변수만 선언
		FireEngine fe = new FireEngine(); //Car의 자식클래스들인 FireEngine, Ambulance, PoliceCar의 각 인스턴스 생성
		Ambulance am = new Ambulance();
		PoliceCar pc = new PoliceCar();
		
		Emergency emergency = new Emergency(); //Emergency 인스턴스 생성
		
		
		int select = 0; // 사용자로부터 입력받을 값 초기화
		while(select != 5) { //반복문 사용하여 사용자 입력 받아서 그에 맞게 결과 보여줌
			System.out.println("What kind of Emergency?");
			System.out.println("1. Fire   2. Patient   3. Thief   4. Record   5. End");
			
			select = kbd.nextInt();
			switch(select) { 
			case 1: // 사용자가 1을 입력하면 car에 fe를 car타입으로 형변환하여 대입
				car = fe; //업캐스팅
				emergency.EM_Call(car); //119
				break;
			case 2:// 사용자가 2을 입력하면 car에 am을 car타입으로 형변환하여 대입
				car = am;//업캐스팅
				emergency.EM_Call(car);//119
				break;
			case 3:// 사용자가 3을 입력하면 car에 pc을 car타입으로 형변환하여 대입
				car = pc;//업캐스팅
				emergency.EM_Call(car);//112
				break;
			case 4:
				emergency.EM_record(); //emergency의 EM_record 실행
				break; 
			case 5: //사용자가 5를 입력하면 switch문 빠져나가고 while반복문도 끝낸다.
				break;
			default: //1~5가 아닌 수를 입력하면 다음 문장 출력
				System.out.println("Wrong Input");
			
			}
		}
		System.out.println("Finished");

	}
}

class Car{ //조상클래스인 Car class 생성
	
	private String emgType; //멤버변수 선언
	private int number;
	private String carType;
	private String reqPerson;
	
	Car(String emgType, int number, String carType, String reqPerson) { //private 변수 4개 받아서 대입하는 생성자 
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	Car() {} //default 생성자
	
	public String getEmgType() { //private 변수들의 getter와 setter
		return emgType;
	}
	public void setEmgType(String emgType) {
		this.emgType = emgType;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getReqPerson() {
		return reqPerson;
	}
	public void setReqPerson(String reqPerson) {
		this.reqPerson = reqPerson;
	}
	
	public String getStr() { //멤버변수들 출력
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t\t"+getReqPerson(); //getNumber는 toString 안해줘도되낭
	}

}

class FireEngine extends Car { //Car class의 자식인 FireEngine class 생성
	FireEngine() { //초기화할 값들을 매개변수로 담아 조상클래스의 생성자인 super로 보낸다.
		super("Fire", 119, "FireEngine", "FireFighter");
	}
	public String toString() { //오버라이딩
		return getStr();
	}
}

class Ambulance extends Car {//Car class의 자식인 Ambulance class 생성
	Ambulance() {  //초기화할 값들을 매개변수로 담아 조상클래스의 생성자인 super로 보낸다.
		super("Patient", 119, "Ambulance", "Doctor");
	}
	public String toString() { //오버라이딩
		return getStr();
	}
}


class PoliceCar extends Car {//Car class의 자식인 PoliceCar class 생성
	PoliceCar() { //초기화할 값들을 매개변수로 담아 조상클래스의 생성자인 super로 보낸다.
		super("Thief", 112, "PoliceCar", "PoliceOfficer");
	}
	public String toString() { //오버라이딩
		return getStr();
	}
}





class Emergency {
	
	public Car emgList[] = new Car[10]; //Car 타입의 참조변수 배열 선언(최대 10개 인스턴스 저장 가능)
	int i = 0;
	
	public void EM_Call(Car car) {
		
		if(car.getNumber() == 112) //car 종류에 맞게 결과 출력
			System.out.println("Call 112");
		else
			System.out.println("Call 119");
		emgList[i++] = car; //매개변수로 받은 car을 배열에 저장
		
	}
	
	public void EM_record() { //현재까지 저장된 배열의 모든 데이터 출력

		System.out.println("Emergency\tNumber\t\tCar_Type\t\tRequired");
		for(int j = 0; j < i; j++) 
			System.out.println(emgList[j].toString()); //각 자식클래스에서 오버라이팅된 toString 메서드 실행
		
	}
	
}
