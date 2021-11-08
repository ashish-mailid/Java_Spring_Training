package com.training.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training.interfaces.Operator;
import com.training.interfaces.PrintInterface;

@Component
public class OperatorDemo {
	
	@Autowired
	private Operator operator;
	
	@Autowired
	private PrintInterface printInterface;
	
	
	
	public String getResult(int x, int y)
	{
		return printInterface.print(operator.operate(x, y));
	}
	
	

}
