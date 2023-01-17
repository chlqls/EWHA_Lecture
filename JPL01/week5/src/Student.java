//예제5-4(1)
public class Student extends Person{
	private int studentNumber;
	
	public Student() {
		super();
		studentNumber = 0;
	}
	
	public Student(String initialName, int initialNumber) {
		super(initialName);
		studentNumber = initialNumber;
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber = newStudentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() {
		System.out.println("Student Name: " + getName());
		System.out.println("Strudent Number: " + studentNumber);
	}

	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	}

}
