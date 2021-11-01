package inheritance.oneperconcreteclass;

public class Student extends Person{
	private char grade;
	
	
	public Student(String name, String title) {
		super(name, title);
	}


	public Student(String name, String title, char grade) {
		super(name, title);
		this.grade = grade;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return super.toString()+"Student [grade=" + grade + "]";
	}


	
	

	
	
	

}
