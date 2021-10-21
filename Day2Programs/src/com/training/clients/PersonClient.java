package com.training.clients;

import com.training.classes1.Customer;
import com.training.classes1.Employee;


public class PersonClient {

	public static void main(String[] args) {
		
		Customer p1 = new Customer("sam","12-10-1998",100);
		
		System.out.println(p1.getName()+" "+p1.getDob()+" "+p1.getWalletBalance());
		
		Employee e1=new Employee("peter", "12-03-1975", 1001, 25000.50);
		
		System.out.println(e1.getName()+" "+e1.getBasic());
	}

}
