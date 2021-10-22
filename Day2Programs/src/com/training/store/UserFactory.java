package com.training.store;


import com.training.store.Customer;
import com.training.store.Student;
import com.training.store.User;

public class UserFactory {
	
	public static User getUserInstance(String userType) {
		User user = null;
		
		switch(userType.toUpperCase())
		{
		case "C":
			user = new Customer("sam", "sam@gmail.com");
			break;
		case "S":
			user = new Student("peter", 12345);
			break;
		
		case "E":
			user = new Employee1("john", 12555);
			break;
		}
		return user;
		
	}

}
