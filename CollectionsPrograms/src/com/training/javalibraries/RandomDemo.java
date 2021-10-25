package com.training.javalibraries;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		String temp = "abcdxyzsdfg1235555";
		Random random = new Random();

		for(int i=1;i<6;i++)
		System.out.print(temp.charAt(random.nextInt(18))); // -2 ^ 32 to 2^32 -1
	}

}
