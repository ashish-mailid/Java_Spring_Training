package com.training.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TestInputDemo {

	public static void main(String[] args) throws InputTypeMisMatchException {
		System.out.println("Enter single digit,non zero, + ve number");
		
		int n = new Scanner(System.in).nextInt();
		if(n<=0 || n > 9)
			//throw new IOException("Enter valid number");
			throw new InputTypeMisMatchException("Enter Single Digit, Non Zero, +ve number");

	}

}
