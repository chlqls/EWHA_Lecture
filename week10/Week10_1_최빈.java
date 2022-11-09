import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student { //학생 클래스 생성
	String name;
	String ID;
	int age;
	
	Student() {	} //default 생성자
	
	Student(String name, String ID, int age) { //매개변수로 받은 값으로 멤버변수들을 초기화하는 생성자
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
}

public class Week10_1_최빈 {

	static Scanner kbd = new Scanner(System.in); //이 클래스 안의 여러 메서드에서 필요하므로 중복을 피하기 위해 static붙여서 메서드 밖으로 빼냈다
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input Student Name, ID, and age. O for name to quit.");
		ArrayList <Student> stu = new ArrayList<Student> (); //Student 인스턴스만 저장되는 ArrayList인 stu 생성
		
		while(true) { //이름으로 0받을 때까지 무한 루프
			String name = kbd.next();
			if(name.equals("0")) //이름이 0이면 반복 중단
				break;
			
			Student s = new Student(name, kbd.next(), kbd.nextInt()); //입력받은 이름, ID, 나이를 이용해서 생성자를 통해 Student 인스턴스 생성하고 참조변수 s에 연결
			stu.add(s); //add()메서드를 이용해서 ArrayList에 위에서 생성된 s 추가
		}
		
		System.out.println("NUMBER\tNAME\tID\tAGE");
		printResult(stu); //전체 리스트 출력
		
		while(true) { //추가, 삭제, 출력, 종료를 반복하면서 진행
			System.out.println("\nChoose the opertation you want.");
			System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
			
			int num = kbd.nextInt(); //사용자로부터 숫자 입력받음
			if(num == 1) { //1이면 addStudent() 이용해서 ArrayList에 추가
				System.out.println("Input new Student Name, ID, and age, and the location");
				addStudent(stu); 
			}
			else if(num == 2) { //2면 deleteStudent 메서드 이용해서 ArrayList에서 삭제
				System.out.println("Input Student Number to delete.");
				deleteStudent(stu);
			}
			else if(num == 3) //3이면 전체 리스트 출력
				printResult(stu);
			else if(num == 4) //4면 프로그램 종료
				break;
			else //1~4 이외의 숫자면 잘못된 입력
				System.out.println("Wrong input.");
		}		
	}
	
	public static void printResult(List<Student> stu) {
		for(int i = 0; i < stu.size(); i++) { //ArrayList의 size()만큼 반복문 실행
			System.out.println((i + 1) + "\t" + stu.get(i).name + "\t" + stu.get(i).ID + "\t" + stu.get(i).age); //get()메서드 사용해서 ArrayList 출력
		}
	}

	public static void deleteStudent(List<Student> stu) {
		int deleteNum = kbd.nextInt(); //삭제할 위치 입력받음
		stu.remove(deleteNum - 1); // remove() 메서드 이용해서 특정 위치의 학생정보 삭제
		printResult(stu);
	}
	
	public static void addStudent(List<Student> stu) {
		Student s = new Student(kbd.next(), kbd.next(), kbd.nextInt()); //학생정보 입력받아서 새로운 Student인스턴스 생성
		int location = kbd.nextInt(); //추가할 위치도 입력받음
		stu.add(location - 1, s);//add()메서드 이용해서 특정 위치에 추가
		printResult(stu);
	}
}
