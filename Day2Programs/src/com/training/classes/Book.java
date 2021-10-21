package com.training.classes;

public class Book {
	private String isbn;
	private String title;
	private double price;
	private long stock;
	public Book() {
		super();
	}
	public Book(String isbn, String title, double price, long stock) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.stock = stock;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public long getStock() {
		return stock;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	
		
	
}
