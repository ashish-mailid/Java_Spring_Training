package inheritance.oneperhierarchy;

public class Person {

	private String name;
	private String title;
	public Person(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", title=" + title + "]";
	}
	
}
