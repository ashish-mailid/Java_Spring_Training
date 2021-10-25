package com.training.as003_1;

public class Client {

	public static void main(String[] args) {
		
		Customer c=new Customer("sales");
		System.out.println("customer id " + c.getCustomerId()+ " generated");
		Customer c1=new Customer();
		System.out.println("customer id " + c1.getCustomerId()+ " generated");
		
		Account account = new Account("sam12345");

	}

}
