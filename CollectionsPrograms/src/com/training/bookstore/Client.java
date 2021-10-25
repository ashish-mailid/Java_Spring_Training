package com.training.bookstore;

import java.util.List;

public class Client {

	public static void main(String[] args) {
	
		BookStore store = new BookStore();
		
		store.addBook(new Book("2345", "C", 150.25, 100));
		store.addBook(new Book("6789", "Cplus", 150.25, 100));
		store.addBook(new Book("7865", "Python", 150.25, 100));
			
		print(store.getBooks());
		
		//System.out.println(store.deleteBook("2345"));
		print(store.getBooks());
		
		System.out.println("--------------------");
		System.out.println(store.updateStockBook("7865", 150));
		print(store.getBooks());
		System.out.println("--------------------");
		print(store.getBooksPattern("C"));

	}

	private static void print(List<Book> books) {
		
		for(Book b:books)
		{
			System.out.println(b);
		}
	}

}
