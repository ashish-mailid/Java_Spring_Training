package com.training.store;

public class Student extends User{

	private long regNo;

	public Student() {
		super();
	}

	public Student(String name, long regNo) {
		super(name);
		this.regNo = regNo;
	}

	public long getRegNo() {
		return regNo;
	}

	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return super.toString()+" "+regNo;
	}
	public void giveOffers()
	{
		System.out.println("You get a discount of 20%");
	}
}
