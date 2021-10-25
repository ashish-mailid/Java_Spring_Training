package com.training.collections;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> subjects = new HashSet<>();
		subjects.add("maths"); subjects.add("maths"); subjects.add("science");subjects.add("English");
		
		System.out.println(subjects);
		
		//search
		System.out.println(subjects.contains("maths"));
		
		//remove
		subjects.remove("science");
		System.out.println(subjects);
		
	}

}
