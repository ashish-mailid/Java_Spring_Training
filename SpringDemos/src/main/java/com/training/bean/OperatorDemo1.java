package com.training.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.interfaces.Operator;
import com.training.interfaces.Operator1;
import com.training.interfaces.Printer;

public class OperatorDemo1 {
	
	@Autowired
	private Operator1 operator; // property

	@Autowired
	private Printer printer;
		
	public int execute(int x,int y)
	{
		int result = operator.operate(x, y);
		printer.print(result);
		return result;
	}
	
	
}
