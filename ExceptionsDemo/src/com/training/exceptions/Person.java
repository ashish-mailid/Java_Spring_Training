package com.training.exceptions;

import java.io.Serializable;

public class Person implements Serializable{
	private transient String name; // does not participate in serialization
	private String email;
	private long phoneNo;
	public Person() {
		super();
	}
	public Person(String name, String email, long phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return name+" "+email+" "+phoneNo;
	}

}
