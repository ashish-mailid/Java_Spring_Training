package com.training.as004_1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
	System.out.println("Enter mode of payment..");
	
	String mode = new Scanner(System.in).next();
		Payment payment  = Factory.getPaymentInstance(mode);

		payment.makePayment(2000);
	}

}
