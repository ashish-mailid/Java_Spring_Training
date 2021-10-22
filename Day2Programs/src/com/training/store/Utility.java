package com.training.store;

import java.util.Scanner;

public class Utility {
	
	public static void testOffers(User user)
	{
		System.out.println("Name:"+user.getName());
		System.out.println("Offers:");
		user.giveOffers();
		
		if(user instanceof Customer) {
		//Customer getEmail()
		Customer c = (Customer)user;
		System.out.println(c.getEmail());
		}
		
		else if(user instanceof Employee1) {
		Employee1 e =(Employee1)user;
		System.out.println(e.getEmpCode());
		}
		
		else if(user instanceof Student) {
			Student e =(Student)user;
			System.out.println(e.getRegNo());
			}
		
		
		
	}

	
}
