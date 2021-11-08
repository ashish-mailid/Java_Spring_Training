package com.training.bean;

import org.springframework.stereotype.Component;

import com.training.interfaces.PrintInterface;


public class ConsoleWriter implements PrintInterface {

	@Override
	public String print(int result) {
		return ("Printing to the Console:"+result);

	}

}
