package com.training.classes;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("emp")
public class Employee extends Person{

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(long id, String name, String dept) {
		super(id, name);
		this.dept = dept;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+" "+dept;
	}
	
}
