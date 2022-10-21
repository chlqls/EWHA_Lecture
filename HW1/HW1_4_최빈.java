import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class HW1_4_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("How many students are there? "); //학생 수 입력받기
		StudentScore score[] = new StudentScore[kbd.nextInt()]; //입력받은 수만큼의 크기의 StudentScore 배열 생성
		System.out.println("Input the information.\n");
		kbd.nextLine();
		
		for(int i = 0; i < score.length; i++) { //반복문을 이용하여 학생정보와 각 점수 입력받기
			score[i] = new StudentScore(); // score 배열에 StudentScore인스턴스 생성하고 연결
			System.out.print("ID:");
			score[i].setId(kbd.nextLine());
			System.out.print("Name:");
			score[i].setName(kbd.nextLine());
			System.out.print("Korean:");
			score[i].setKorean(kbd.nextInt());
			System.out.print("Math:");
			score[i].setMath(kbd.nextInt());
			System.out.print("English:");
			score[i].setEnglish(kbd.nextInt());
			System.out.println();
			kbd.nextLine();
		}
		
		double korAvg = 0, mathAvg = 0, engAvg = 0;	//각 과목 평균을 구하기 위해 필요한 변수들
		
		System.out.println("NAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG"); //여기부터 결과 출력
		for(int i = 0; i < score.length; i ++) {
			score[i].display(); //StudentScore의 display 메서드를 호출해서 반복적으로 각 학생들의 정보와 점수 출력
			int sum = score[i].getKorean() + score[i].getMath() + score[i].getEnglish(); //각 학생별 총점구하기
			System.out.printf("\t%d\t%.2f\n", sum, ((double)sum/3)); //각 학생별 총점과 평균 출력
			
			korAvg += score[i].getKorean(); //추후에 출력할 각 과목별 평균점수를 구하기 위해 반복문 이용해서 과목별 총점 구하기
			mathAvg += score[i].getMath();
			engAvg += score[i].getEnglish();
		}
		
		korAvg /= score.length; //각 과목별 총점을 학생수로 나누어 평균 출력
		mathAvg /= score.length;
		engAvg /= score.length;
		
		
		System.out.printf("Subject Avg\t\t%.2f\t%.2f\t%.2f\n", korAvg, mathAvg, engAvg); // 각 과목별 평균 출력 
		
		System.out.println("\n<Students over the average>\n"); // 반복문과 조건문 이용해서 각 과목별 평균점수 이상인 학생의 이름 출력
		System.out.println("Korean:");
		for(int i = 0; i < score.length; i ++) {
			if(score[i].getKorean() >= korAvg)
				System.out.print(score[i].getName() + "\t");
		}
		System.out.println("\nMath:");
		for(int i = 0; i < score.length; i ++) {
			if(score[i].getMath() >= mathAvg)
				System.out.print(score[i].getName() + "\t");
		}
		System.out.println("\nEnglish:");
		for(int i = 0; i < score.length; i ++) {
			if(score[i].getEnglish() >= engAvg)
				System.out.print(score[i].getName() + "\t");
		}
				
	}

}


class StudentInformation { //StudentInformation 클래스 생성
	private String name; //멤버변수 선언
	private String id;
	
	public void display() { //name과 ID 출력
		System.out.print(name + "\t" + id + "\t");
	}

	public String getName() { //private변수인 name과 id의 getter과 setter
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}


class StudentScore extends StudentInformation { //StudentInformation클래스를 상속받은 StudentScore 클래스 생성
	private int korean; //멤버변수 선언
	private int math;
	private int english;
	
	public void display() { //StudentInformation클래스의 display메서드 오버라이딩
		super.display(); //name과 id를 추력하기 위해 StudentInformation클래스의 display메서드 호출
		System.out.print(korean + "\t" + math + "\t" + english); //추가로 과목별 점수도 출력
	}

	public int getKorean() { //private멤버변수들의 일반적인 getter와 setter
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}	
}