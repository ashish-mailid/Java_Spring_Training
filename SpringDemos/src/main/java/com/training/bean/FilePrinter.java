package com.training.bean;

import java.io.FileWriter;
import java.io.IOException;

import com.training.interfaces.Printer;

public class FilePrinter implements Printer {

	@Override
	public void print(int result) {
		
		try(FileWriter fw=new FileWriter("results.txt")) {
			fw.write("Result: "+result);
						
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
