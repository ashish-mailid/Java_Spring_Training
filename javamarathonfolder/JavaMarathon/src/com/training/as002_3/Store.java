package com.training.as002_3;

import java.util.List;

public class Store {
	//private List<Product> products;
	
	private static Product[] products;
	
	public static Product[] getProducts() {
		return products;
	}

	public Store() {products=
			new Product[] {
					new Product(1234, "nuts", 125.50, 100),
					new Product(5678, "dip", 75.50, 100),
			};
	
	}
	
	

}
