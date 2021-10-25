package com.training.javalibraries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1);
		
		Date d2=new Date(2020, 4, 6);
		System.out.println(d2);
		
		//java 8
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate date1 = LocalDate.of(2020, 03, 04);
		System.out.println(date1);
		
		LocalDateTime today1 = LocalDateTime.now();
		System.out.println(today1);
		
		//read User's dob as a string in year/mm/dd format and check if he/she is eligible to vote
		
		
		//String dobString = "2006 03 12";
		System.out.println("Enter dob as text in yyyy MM dd");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "yyyy MM dd" );
		
		String dobString = new Scanner(System.in).nextLine();
		
		LocalDate dob =LocalDate.parse(dobString,formatter);
		
		System.out.println(dob);
		
		long elapsedDays = ChronoUnit.DAYS.between(dob, today);
		System.out.println(elapsedDays/365); 
		long age = elapsedDays/365;
		
		if(age < 18)
			System.out.println("You are not eligible to vote");
		else
			System.out.println("You are eligible to vote");
		

	}

}
