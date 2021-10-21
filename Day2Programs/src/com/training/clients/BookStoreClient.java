package com.training.clients;

import com.training.classes.Book;
import com.training.classes.BookStore;

public class BookStoreClient {

	public static void main(String[] args) {
		BookStore store = new BookStore(new Book("2345", "C", 150.20, 100));
		Book books[] = store.getBooks();
		printBooks(books,store.getCount());

		store.addBook(new Book("4567", "CPlus", 175.50, 100));
		printBooks(books,store.getCount());
	}

	
	public static void printBooks(Book books[],int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(books[i].getIsbn()+" "+books[i].getTitle());
		}
	}
}
