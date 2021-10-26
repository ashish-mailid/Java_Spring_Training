package com.training.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.training.exceptions.Person;

public class DeSerializeDemo {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("d:\\test\\record.ser"));
			try {
				Person person1 = (Person)oin.readObject();
				System.out.println(person1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
