package com.training.store;

public class Employee1 extends User{
private long empCode;

	public Employee1() {
	super();
}

	public Employee1(String name, long empCode) {
		super(name);
		this.empCode = empCode;
	}

	@Override
	public String toString() {
		return super.toString()+" "+empCode;
	}

	@Override
	public void giveOffers() {
		System.out.println("Employee offer of 10% reward points");
		
	}

}
