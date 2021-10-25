package com.training.as004_1;

public class PaymentByCreditCard implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Making Payment by CreditCard :"+amount);
		
	}

}
