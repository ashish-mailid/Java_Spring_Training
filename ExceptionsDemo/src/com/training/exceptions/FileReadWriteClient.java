package com.training.exceptions;

import java.io.IOException;

public class FileReadWriteClient {

	public static void main(String[] args) {
		FileReadAndWriteDemo fileObject = new FileReadAndWriteDemo();
		try {
			fileObject.readFile("D:\\clients\\infrasoft_ws");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
