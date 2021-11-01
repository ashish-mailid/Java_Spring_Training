package com.training.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="product1")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long code;
	
	@Column(name = "name",length = 100,unique = true,nullable = false)
	private String name;
	
	
	private double price;
	private long stock;
	public Product() {
		super();
	}
	public Product(String name, double price, long stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
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
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
	

}







