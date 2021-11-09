package com.training.bean;


import com.training.interfaces.Operator1;

public class AddOperator1 implements Operator1{

	@Override
	public int operate(int x, int y) {
		
		return x+y;
	}

}
