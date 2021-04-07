package com.training.simplespringdemos;

import com.training.simplespringdemos.interfaces.Operator;

public class OperatorBean {
	private Operator operator;

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public int operation(int x,int y)
	{
		return operator.operate(x,y);
	}

}
