package com.training.treeset;

public class Product implements Comparable<Product>{
	private long code;
	private String name;
	private double price;
	public Product() {
		super();
	}
	public Product(long code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return code+" "+name+" "+price;
	}
	@Override
	public int compareTo(Product o) {
		
		return name.compareTo(o.getName());
	}
	
	

}
