package com.training.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.interfaces.Operator;

public class OperatorDemo {
	
	@Autowired // bytype
	private Operator operator;
	/*
	 * private List<String> addressList;
	 * 
	 * public List<String> getAddressList() { return addressList; }
	 * 
	 * public void setAddressList(List<String> addressList) { this.addressList =
	 * addressList; }
	 */

	/*
	 * public Operator getOperator() { return operator; }
	 * 
	 * public void setOperator(Operator operator) { this.operator = operator; }
	 */

	public int getResult(int x,int y)
	{
		return operator.operate(x, y);
	}
	
	public void init()
	{
		System.out.println("This is an Initializing method");
	}
	
	public void end()
	{
		System.out.println("This is destroy..");
	}
}
