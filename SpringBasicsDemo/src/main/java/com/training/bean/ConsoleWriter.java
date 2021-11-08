package com.training.bean;

import com.training.interfaces.PrintInterface;

public class ConsoleWriter implements PrintInterface {

	@Override
	public void print(int result) {
		System.out.println("Printing to the Console:"+result);

	}

}
