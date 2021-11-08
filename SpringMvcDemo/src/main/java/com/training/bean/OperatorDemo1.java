package com.training.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.interfaces.Operator;
import com.training.interfaces.PrintInterface;

public class OperatorDemo1 {
	
	@Autowired
	private Operator operator; // looks for the qualifying bean
	
	@Autowired
	private PrintInterface printInterface;
		
	
	public void getResult(int x, int y)
	{
		printInterface.print(operator.operate(x, y));
	}
	
	
	

}
