package com.training.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name="employee2")
public class Employee2 extends Person2{

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee2(long id, String name, String dept) {
		super(id, name);
		this.dept = dept;
	}

	public Employee2() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+" "+dept;
	}
	
}

