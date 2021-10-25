package com.training.as004_1;

public class PaymentByCash implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.println("Making Payment by Cash :"+amount);
		
	}

}
