package com.training.clients;

import java.util.Scanner;

import com.training.classes1.CardPayment;
import com.training.classes1.CashPayment;
import com.training.interfaces.Payment;
import com.training.store.Customer;
import com.training.store.Student;
import com.training.store.User;
import com.training.store.UserFactory;
import com.training.store.Utility;

public class StoreClient {

	public static void main(String[] args) {

		System.out.println("Enter type of User : C/S/E");
		Scanner sc = new Scanner(System.in);
		String userType = sc.next();
		
		User user = UserFactory.getUserInstance(userType);
		if(user!=null)
		//user.giveOffers(); // dynamic binding
			Utility.testOffers(user);
		else
			System.out.println("Not Yet Implemented..");
		
		System.out.println("Enter Mode of Payment.. cash/card/wallet");
		String mode = sc.next();
		
		Payment payment =null;
		switch(mode)
		{
		case "cash":
				payment=new CashPayment(); break;
		case "card":
			payment=new CardPayment(); break;
		}
		
		payment.makePayment(2000);
		
	}

}







