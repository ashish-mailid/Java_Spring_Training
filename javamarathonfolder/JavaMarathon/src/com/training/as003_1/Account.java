package com.training.as003_1;

import java.util.Random;

public class Account {
	private String username;
	private String password;
	
	public Account() { }
	public Account(String username) {
		super();
		this.username = username;
		this.password = generatePassword();
		System.out.println("password generated:"+password);
	}
	
	private String generatePassword() {
		String letters = "abcdefgh12345";
		StringBuffer spass = new StringBuffer();
		Random r=new Random();
		for(int i=1;i<=4;i++)
		{
			spass.append(letters.charAt(r.nextInt(i)));
		}
		
		return username.substring(0,5)+spass;
	}
	
	
	
}
