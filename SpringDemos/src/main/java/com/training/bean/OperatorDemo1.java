package com.training.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.interfaces.Operator;

public class OperatorDemo1 {
	
	@Autowired
	private Operator operator; // property

		
	public int execute(int x,int y)
	{
		return operator.operate(x, y);
	}
	
	
}
