package com.training.classes1;

public class Person {
	private String name;
	private String dob;
	
	public Person() {
		super();
	}

	public Person(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String toString()
	{
		return name+" "+dob;
	}
	

}
