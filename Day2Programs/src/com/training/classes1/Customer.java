package com.training.classes1;

public class Customer extends Person {

	private double walletBalance;

	public Customer() {
		super();
	}

	public Customer(String name,String dob,double walletBalance) {
		super(name,dob);// calls the Person(name,dob)
		this.walletBalance = walletBalance;
	}
	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public String toString()
	{
		return super.toString()+" "+walletBalance;
	}
}
