package com.training.store;

public class Customer extends User{

	private String email;

	public Customer() {
		super();
	}

	public Customer(String name, String email) {
		super(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString()+" "+email;}	
	
	public void giveOffers()
	{
		System.out.println("You get a discount of 10%");
	}
	
}
