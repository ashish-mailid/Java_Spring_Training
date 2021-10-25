package com.training.as005_03;

public class Menu {
	private String dish;
	private double price;
	public Menu(String dish, double price) {
		super();
		this.dish = dish;
		this.price = price;
	}
	public Menu() {
		super();
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [dish=" + dish + ", price=" + price + "]";
	}
	

}
