package com.training.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileReadAndWriteDemo {

	public void readFile(String fileName) throws IOException
	{
		File file = new File(fileName);
		if(file.exists())
		{
			if(file.isFile()) {
				System.out.println("ordinary file");
				System.out.println("Size:"+file.length());
				System.out.println("Date modified:"+new Date(file.lastModified()));

				FileReader fr = new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String str="";
				while((str=br.readLine())!=null)
				{
						System.out.println(str);
				}
				

			}
			else if(file.isDirectory())
				System.out.println("Directory file");
			String[] files = file.list();
			System.out.println("Files:"+Arrays.toString(files));
		}
		else
		{
			System.out.println("File does not exist");
			System.out.println("Creating a file");
			file.createNewFile();
		}

	}


}
