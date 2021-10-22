package com.training.bookstore;

import java.util.List;

public class Client {

	public static void main(String[] args) {
	
		BookStore store = new BookStore();
		
		store.addBook(new Book("2345", "C", 150.25, 100));
		store.deleteBook("678");
		print(store.getBooks());
		

	}

	private static void print(List<Book> books) {
		
		
	}

}
