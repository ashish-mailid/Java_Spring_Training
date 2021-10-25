package com.training.as002_3;

public class Product {
	private long code;
	public long getCode() {
		return code;
	}


	public void setCode(long code) {
		this.code = code;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
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
	}


	private String desc;
	private double price;
	private long stock;
	
	
	public Product() {
		super();
	}


	public Product(long code, String desc, double price, long stock) {
		super();
		this.code = code;
		this.desc = desc;
		this.price = price;
		this.stock = stock;
	}
	
	//Constructors,getters,setters
}
