package com.training.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.interfaces.Operator;
import com.training.interfaces.PrintInterface;

public class OperatorDemo {
	
	
	private Operator operator;
	
	
	private PrintInterface printInterface;
	
	public void setPrintInterface(PrintInterface printInterface) {
		this.printInterface = printInterface;
	}

	public void setOperator(Operator operator)
	{
		this.operator = operator;
	}
	
	public void getResult(int x, int y)
	{
		printInterface.print(operator.operate(x, y));
	}
	
	private String message;
	private List<String> countries;
	

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void start()
	{
		System.out.println("Init method called");
	}
	
	public void end()
	{
		System.out.println("End method");
	}

}
