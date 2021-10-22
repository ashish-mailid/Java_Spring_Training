package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> ageList = new ArrayList<>();
		
		//add
		ageList.add(12); ageList.add(24);ageList.add(12);ageList.add(1, 35);
		System.out.println(ageList);
		
		ageList.add(56); System.out.println(ageList);
		
		Integer n[] = {3,4,9,1};
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(n));
		list1.add(89);
		System.out.println(list1);
		
		list1.set(2, 97);
		System.out.println(list1);
		
		// remove an element based on index
		list1.remove(2);
		
		System.out.println(list1);
		//remove an element based on an element
		
		list1.remove(list1.indexOf(89));
		System.out.println(list1);
		
		//search for an element
		
		System.out.println(list1.indexOf(1));
		
		System.out.println(list1.contains(1));
		
		System.out.println(list1.get(1));

		//indexed loop
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("--------------");
		
		//enhanced for
		
		for(Integer element:list1)
		{
			System.out.println(element);
		}
	}

}
