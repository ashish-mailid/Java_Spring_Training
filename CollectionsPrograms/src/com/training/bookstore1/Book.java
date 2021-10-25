package com.training.bookstore1;

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
	@Override
	public String toString() {
		return isbn+" "+title+" "+price+" "+stock;
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}	
	
	/*
	 * public boolean equals(Object obj) { Book b1=(Book)obj;
	 * if(isbn.equals(b1.getIsbn())) return true;
	 * 
	 * return false; }
	 * 
	 * public int hashCode() { return isbn.hashCode(); }
	 */
	
	
}















