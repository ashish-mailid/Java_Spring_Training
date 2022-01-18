package com.training.bean;

public class HelloWorld {
	
	private String message;
	private int age;
	
	public HelloWorld(String message,int age) // Constructor Injection
	{
		this.message=message;
		this.age=age;
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
		
	public String sayHello()
	{
		return message+" "+age;
	}

}
