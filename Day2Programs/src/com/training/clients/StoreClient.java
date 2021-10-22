package com.training.clients;

import java.util.Scanner;
import com.training.store.Customer;
import com.training.store.Student;
import com.training.store.User;
import com.training.store.UserFactory;

public class StoreClient {

	public static void main(String[] args) {

		System.out.println("Enter type of User : C/S/E");
		Scanner sc = new Scanner(System.in);
		String userType = sc.next();
		
		User user = UserFactory.getUserInstance(userType);
		if(user!=null)
		user.giveOffers(); // dynamic binding
		else
			System.out.println("Not Yet Implemented..");
		
	}

}
