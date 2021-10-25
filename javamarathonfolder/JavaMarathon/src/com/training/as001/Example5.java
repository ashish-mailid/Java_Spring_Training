
/*Write a java method to implement linearSearch on an array of numbers.
public static int liSearch(int numbers[],int key) that returns the position of the key element or -1.  
Test with a main method.
*/

package com.training.as001;

public class Example5 {
	
	public static int liSearch(int numbers[],int key)
	{
		for(int i=0;i<numbers.length;i++)
			if(numbers[i]==key)
				return i;
		return -1;
	}
	
	public static void main(String[] args) {
		int numbers[] = {4,5,3,2,16,8};
		int key = Integer.parseInt(args[0]);
		
		int position = liSearch(numbers, key);
		if(position!=-1)
		System.out.println(key +" found @ position "+position);
		else
		System.out.println("Search unsucessful");
	}

}
