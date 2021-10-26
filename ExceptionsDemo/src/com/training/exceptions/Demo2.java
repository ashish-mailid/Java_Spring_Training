package com.training.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		
		try (FileWriter fw=new FileWriter("test.txt")) //Autoclosure
		{		 
			fw.write("Hello good Morning This is updated");
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * finally { try { fw.close(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */
	}

}
