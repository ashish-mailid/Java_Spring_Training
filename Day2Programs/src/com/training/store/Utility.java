package com.training.store;

import java.util.Scanner;

public class Utility {
	
	public static void testOffers()
	{
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter type of User : C/S/E");
		Scanner sc = new Scanner(System.in);
		String userType = sc.next();
		switch(userType.toUpperCase())
		{
		case "C":
			testOffers(new Customer("sam", "sam@gmail.com"));
			break;
		case "S":
			testOffers(new Student("peter", 1234));
			break;
			
		case "E":
			testOffers(new Employee1("john",12345));
			break;
			
		}
		
		testOffers();
	}
}
