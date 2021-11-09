package com.training.bean;

import com.training.interfaces.Operator;

public class OperatorDemo {
	
	private Operator operator; // property

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public int execute(int x,int y)
	{
		return operator.operate(x, y);
	}
	
	public void init(){
		System.out.println("Initializing");
	}

	public void close()
	{
		System.out.println("Destroying..");
	}
}
