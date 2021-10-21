package com.training.clients;

import com.training.classes1.Customer;
import com.training.classes1.Person;

public class Client1 {

	public static void main(String[] args) {
		
		Person p1=new Person("sam", "12-11-2000");
		
		System.out.println(p1);// calls toString()
		
		
		Customer c1=new Customer("peter", "12-3-1998", 100);
		System.out.println(c1);
	}

}
