package com.training.bean;

import org.springframework.stereotype.Component;

import com.training.interfaces.Operator1;

@Component
public class MultiplyOperator1 implements Operator1{

	@Override
	public int operate(int x, int y) {
		
		return x*y;
	}

}
