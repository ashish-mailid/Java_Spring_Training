package com.training.simplespringdemos;

public class HelloBean {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello()
	{
		return "Hello World! Welcome to Spring"+name;
	}

}
