package com.training.classes1;

import com.training.interfaces.Operator;

public class IntOperator implements Operator<Double> {

	@Override
	public void operate(Double x, Double y) {
		System.out.println("adding 2 doubles"+(x+y));
		
	}

}
