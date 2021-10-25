package com.training.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		names.add("sam");
		names.add("Amogh");
		names.add("john");
		System.out.println(names);
		
		
		TreeSet<Product> products = new TreeSet<>();
		
		products.add(new Product(9876, "nuts", 160.25));
		products.add(new Product(1234, "chocolates", 150.25));
		products.add(new Product(7855, "notebooks", 60.25));
		products.add(new Product(2345, "ketchp", 89.25));
		
		System.out.println(products);


	}

}
