package com.training.bean;

public class HelloWorld {
	
	private String message;
	private String name;
		
	public HelloWorld(String message,String name)  // Constructor Injection
	{
		this.message = message;
		this.name=name;
	}
	public HelloWorld() { }
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello()
	{
		return message+" "+name;
	}
}
