package com.training.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.interfaces.Operator;

@Component
public class AddOperator implements Operator {

	@Override
	public int operate(int x, int y) {
		
		return x+y;
	}

}
