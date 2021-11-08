package com.training.bean;

import com.training.interfaces.PrintInterface;

public class MyFileWriter implements PrintInterface {

	@Override
	public String print(int result) {
		return("Printing to the File:"+result);

	}

}
