package com.training.clients;

import java.util.List;

import com.training.bean.Product;
import com.training.dao.ProductDao;

public class Client {
	
	
	public static void main(String[] args) {
	
		ProductDao productDao = new ProductDao();
		/*
		 * productDao.addProduct(new Product("Ketchup", 125, 100));
		 * productDao.addProduct(new Product( "Cookies", 105, 100));
		 * productDao.addProduct(new Product( "Oregano",75, 100));
		 * productDao.addProduct(new Product( "chocos",75, 100));
		 * productDao.addProduct(new Product( "cornflakes",75, 100));
		 */
		
		//productDao.addProduct(new Product("notebook",75, 100));
		
		System.out.println(productDao.searchProduct(2));
		List<Product> products  = productDao.getProducts();
		
		print(products);
		
		System.out.println("-------Pattern Search------------------");
		
		List<Product> products1 = productDao.getProductsByNamePattern("co");
		
		print(products1);
		
		System.out.println("-------stock -------------");
		List<Product> products2 = productDao.getProductsByStock(200);
		
		print(products2);
		
		System.out.println("update stock--------------");
		
		System.out.println(productDao.updateStockByStock(100, 50));
		
		System.out.println("-------stock -------------");
		products  = productDao.getProducts();
		print(products2);
		
		
	}

	private static void print(List<Product> products) {
		products.forEach(p->System.out.println(p));
		
	}

	

}
