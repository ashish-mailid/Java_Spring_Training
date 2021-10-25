package com.training.as002_3;

public class Address {
	private int plotNo;
	private String street;
	private String city;

	public Address(int plotNo, String street, String city) {
		super();
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
	}
	public Address() { }
	
	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
