/*A company insures it’s employees if any of the following criteria is met by them.
a.	Employee is UnMarried
b.	Employee is Married Male above 30 years of age.
c.	Employee is Married Female above 25 years of age.
(Values are entered from command line: Ex :’U’ or M female 26 so on.
Write a java program to display message if the employee is insured or not

(Use Logical Operators for compact code)*/

package com.training.as001;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter M/U");
		char status = sc.next().toUpperCase().charAt(0);
		System.out.println("Enter M/F");
		char gender = sc.next().toUpperCase().charAt(0);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(status=='U' || (status=='M' && gender=='M' && age>30) || (status=='M' && gender=='F' && age>25))
			System.out.println("Insured");
		else
			System.out.println("Not Insured");
		
	}
}
