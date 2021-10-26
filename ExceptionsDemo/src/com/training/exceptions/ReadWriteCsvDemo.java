package com.training.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCsvDemo {

	public static void writetoCsv(String fileName) 
	{
		try(FileWriter fw=new FileWriter(fileName))
		{
		fw.write("sam,sam@gmail.com,9854433332\n");
		fw.write("peter,pet@gmail.com,9954433332\n");
		fw.write("john,john@gmail.com,9854433332\n");
		}catch(IOException e) {System.out.println(e.getMessage()); }
	}
	public static void main(String[] args) throws IOException {

		
			//writetoCsv("d:\\test\\data.csv");
			
			readFromCsv("d:\\test\\data.csv");
			/* that reads all the 3 records in a List of Person where Person is a class with
			 * name , email ,phone No
			 */
		

	}
	private static void readFromCsv(String fileName) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String str="";
		List<Person> persons = new ArrayList<>();
		while((str=br.readLine())!=null)
		{
			//System.out.println(str);
			String[] values = str.split(",");
			Person person = new Person(values[0], values[1], Long.parseLong(values[2]));
			persons.add(person);
				
		}
		
		System.out.println(persons);
	}

}
