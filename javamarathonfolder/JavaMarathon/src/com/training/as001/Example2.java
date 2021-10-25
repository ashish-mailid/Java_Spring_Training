package com.training.as001;

/*Create a Java application that has the following functionalities 
a.	Checking for a prime number
b.	Generating Prime Numbers from lowerlimit to upperlimit that are passed as parameters.
Create a class PrimeGen that has 2 methods isPrime(..) and genPrime(..) for the above functionalities.*/

public class Example2 {
	
	public static boolean isPrime(int n)
	{	
		for(int ctr=2;ctr<=Math.sqrt(n);ctr++)
		{
			if(n%ctr==0) return false;
		}
		
		return true;
	}
	
	public static void genPrime(int low,int high)
	{
		for(int limit=low;limit<=high;limit++)
			if(isPrime(limit))
				System.out.println(limit);
	}
	
	public static void main(String[] args) {
		int low=Integer.parseInt(args[0]);
		int high=Integer.parseInt(args[1]);
		
		genPrime(low,high);
		
	}

}
