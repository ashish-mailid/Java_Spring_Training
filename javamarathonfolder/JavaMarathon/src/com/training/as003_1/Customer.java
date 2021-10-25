package com.training.as003_1;

import com.training.as002_3.User;

public class Customer extends User{

	private long customerId;
	private String dept;
	private static int count;
	private Account account;

	public Account getAccount() {
		return account;
	}

	public Customer(String dept) {
		super();
		this.dept = dept;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	{
		this.customerId= ++count;
	}
	public Customer() {
		//this.customerId= ++count; }
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public String getDept() {
		return dept;
	}
	public static int getCount() {
		return count;
	}

}
