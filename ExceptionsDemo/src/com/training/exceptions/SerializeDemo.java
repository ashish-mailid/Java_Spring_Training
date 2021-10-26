package com.training.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("d:\\test\\record.ser"));
			Person person=new Person("sam", "sam@gmail.com", 877727222);
			oout.writeObject(person);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
