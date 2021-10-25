package com.training.javalibraries;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="computers";
		String s2="computers";
		
		String s3=new String("computers");
		String s4=new String("computers");
		
		System.out.println(s1==s2);//true
		System.out.println(s3==s4); //false

		System.out.println(s1.charAt(2));//m
		System.out.println(s1.substring(3)); //puters
		System.out.println(s1.substring(3,5)); //pu
		
		System.out.println(s1.length());
		
		//program to reverse a String and check if it is a palindrome
		
		String s5="malayalam";
		if(s5.equals(reverseString(s5)))
				System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
	}

	private static String reverseString(String s) {
		
		/*
		 * String reverse =""; for(int i=s.length()-1;i >= 0;i--) { reverse +=
		 * s.charAt(i); System.out.println(reverse); } return reverse;
		 */
		
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}

}
