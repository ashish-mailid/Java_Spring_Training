package com.training.bean;

import com.training.interfaces.Operator;

public class MultiplyOperator implements Operator {

	@Override
	public int operate(int x, int y) {
		
		return x*y;
	}

}
