package com.training.as002_7;

public class Client {

	public static void main(String[] args) {
		Necklace necklace = new Necklace(new Pearl("red", "small", "round"));
		System.out.println(necklace.addPearl(new Pearl("blue", "medium", "round")));
		System.out.println(necklace.addPearl(new Pearl("green", "large", "square")));
		
		System.out.println("Count:"+Necklace.getCount());
		
		System.out.println(necklace);
	}

}
