package com.training.simplespringdemos;

import com.training.simplespringdemos.interfaces.Operator;

public class AddImpl implements Operator {

	@Override
	public int operate(int x, int y) {
		
		return x+y;
	}

}
