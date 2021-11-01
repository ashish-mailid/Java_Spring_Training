package inheritance.oneperhierarchy;

public class SeniorCitizen extends Person{
	private int age;
	
	
	public SeniorCitizen(String name, String title) {
		super(name, title);
	}


	public SeniorCitizen(String name, String title, int age) {
		super(name, title);
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return super.toString()+"SeniorCitizen [age=" + age + "]";
	}

	

	
}
