package com.training.as002_3;


public class User {
	private long iD;
	private String name;
	private Address address;
	//getters ,setters, constructors
	public long getiD() {
		return iD;
	}

	public void setiD(long iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Product enquiresProduct(long code)
	{
		Product[] products = Store.getProducts();
				for(Product p:products)
					if(p.getCode()==code)
						return p;
		
		return null;
	}
	
	

}
