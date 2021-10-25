package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtilityDemos {

	public static void main(String[] args) {
		
		Integer num[] = {4,3,2,6,7,8,9};
		
		System.out.println(Arrays.binarySearch(num, 3));
		
		//Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(num));
		
		System.out.println(list1);
		
		
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(Collections.max(list1));
		
	}

}
