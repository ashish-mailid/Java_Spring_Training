package com.training.exceptions;

public class Demo1 {

	public static void main(String[] args) { // java Demo1 12 0
		
		try {
		int x = Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int z=x/y;
		System.out.println("result:"+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bounds");
		}
		catch(NumberFormatException e)
		{
			System.out.println("text not allowed");
		}
		catch(Exception e)
		{
			System.out.println("any other exception is handled.");
		}
		

	}

}
