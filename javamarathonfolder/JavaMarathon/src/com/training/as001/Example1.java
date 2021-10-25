package com.training.as001;

//1.	Check if a nonzero positive number entered from  command line is odd or even. if user
// enters a invalid an error message is printed.

public class Example1 {
	
	public static boolean isEvenOrOdd(int n)
	{		
		return n%2==0;
	}
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		if(n > 0)
		System.out.println(isEvenOrOdd(n));
		else
		System.out.println("Invalid");
		
	}

}
