package com.training.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@Column(length = 200)
	private String  isbn; //varchar in mysql 
	private String title;
	private double price;
	private long stock;
	private String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Book() {
		super();
	}
	public Book(String isbn, String title, double price, long stock,String category) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.stock = stock;
		this.category = category;
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
	@Override
	public String toString() {
		return isbn+" "+title+" "+price+" "+stock+" "+category;
	
	}	
	
}