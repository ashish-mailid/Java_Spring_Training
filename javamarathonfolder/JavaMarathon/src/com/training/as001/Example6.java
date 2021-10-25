/*Write a java method to implement Binary Search on an array of numbers.
public static int biSearch(int numbers[],int key) that returns the position of the key element or -1.  Test with a main method.
(numbers need to be sorted for Binary Search)*/

package com.training.as001;

public class Example6 {
	
	public static int biSearch(int numbers[],int key,int low,int high)
	{
		int mid=(low+high)/2;
		if(numbers[mid]==key) return mid;
		if(numbers[mid] > key) return biSearch(numbers, key, low, mid-1);
		else return biSearch(numbers, key, mid+1, high);
		
	}
	
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int key = Integer.parseInt(args[0]);
		
		int position = biSearch(numbers, key,0,numbers.length-1);
		if(position!=-1)
		System.out.println(key +" found @ position "+position);
		else
		System.out.println("Search unsucessful");
	}

}
