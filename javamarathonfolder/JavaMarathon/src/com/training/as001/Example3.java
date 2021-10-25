/*Write a Java program that prints day of the week when user inputs a number from keyboard.
a.	Ex: 0 is for Sunday
b.	Optimize the code without using switch case.*/

package com.training.as001;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		//read a number 
		
		System.out.println("Enter a number [0-6]");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println(day[n]);

	}

}
