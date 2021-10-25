package com.training.bookstore1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		
		
		  BookStoreSet store1=new BookStoreSet(); 
		  store1.addBook(new Book("1234", "C",  150.25, 100)); 
		  store1.addBook(new Book("1234", "C", 150.25, 100));
		  store1.addBook(new Book("6789", "Python", 120.25, 100));
		  
		  Set<Book> books = store1.getBooks();
		  
		  print(books);
		 
		  
		  Set<Integer> set1=new LinkedHashSet<>();
		  set1.add(12); set1.add(12);set1.add(24);
		  System.out.println(set1);
		  //equals() hashcode ()
		
			/*
			 * Book b1=new Book("1234", "C", 150.50, 100); Book b2=new Book("1234", "C",
			 * 150.50, 100); System.out.println(b1.equals(b2));//false
			 * System.out.println(b1.hashCode()+" "+b2.hashCode());
			 */
		
	}

	private static void print(Set<Book> books) {
	
		for(Book b:books)
			System.out.println(b);
	}

}
