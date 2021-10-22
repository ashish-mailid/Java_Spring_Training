package com.training.classes1;

import com.training.interfaces.Payment;

public class CashPayment implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment made by Cash for amount"+amount);
		
	}

}
