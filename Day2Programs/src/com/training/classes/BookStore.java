package com.training.classes;

public class BookStore {
	private Book books[];
	private final int SIZE=3; 
	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Book[] getBooks() {
		return books;
	}

	
	public BookStore(Book book)
	{
		books = new Book[SIZE]; // [null,null,null]
		books[count++] = book;
	}
	
	public boolean addBook(Book book)
	{
		if(count < SIZE) {
			books[count++]=book;
		return true;	
		}
		return false;
		
			
	}
}


