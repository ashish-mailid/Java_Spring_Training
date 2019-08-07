package com.store.classes;

import java.io.Serializable;

public class Book{
	private String isbn;
	private String title;
	private String author;
	private double price;
	private transient long stock;
	
	public int hashCode()
	{
		return this.isbn.hashCode();
	}
	
	public boolean equals(Object ob)  //b1.equals(b2)
	{
		Book b2=(Book)ob;
		if(this.isbn.equals(b2.getIsbn()))
		return true;
		else 
		return false;
	}
	
	public Book(String isbn, String title, String author, double price,long stock) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock=stock;
	}
	public Book() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	};
	
	public String toString()
	{
		return isbn+" "+title+" "+author+" "+price+" "+stock;
	}
	
}







