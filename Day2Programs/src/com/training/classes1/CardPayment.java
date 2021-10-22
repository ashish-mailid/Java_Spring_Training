package com.training.classes1;

import com.training.interfaces.Payment;

public class CardPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment made by card for amount:"+amount);

	}

}
