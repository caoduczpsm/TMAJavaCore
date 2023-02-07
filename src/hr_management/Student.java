package hr_management;

public class Student extends Human{

	private int grade;
	
	public Student() {
		super();
	}
	
	public Student(String name, String surname, int grade) {
		super(name, surname);
		this.grade = grade;
	}
	
	public Student(Student student) {
		super();
		this.grade = student.grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", " + super.toString() + "]";
	}

}
