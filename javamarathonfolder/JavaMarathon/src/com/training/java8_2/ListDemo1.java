package com.training.java8_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(3,4,2,1,6);
		
		/*
		 * //printing parta
		 *  list1.forEach(i->System.out.println(i));
		 * list1.forEach(System.out::println);
		 */
		

		// partb 
	//	list1.forEach(i->System.out.println(i*i));
		
		//part c
		//List<Integer> list2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(list2);
		
		//part d
		
		//int max = list1.stream().max(Integer::compare).get();
		
		//System.out.println(max);
		
		//part e
		
		System.out.println(list1.stream().sorted().collect(Collectors.toList()));
	}

}
