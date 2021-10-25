package com.training.as004_1;

public class Factory {

	public static Payment getPaymentInstance(String mode) {
	Payment payment=null;
		switch(mode)
		{
		case "cash" : payment=new  PaymentByCash(); break;
		case "card" : payment=new  PaymentByCreditCard(); break;
		}
		return payment;
	}
	

}
