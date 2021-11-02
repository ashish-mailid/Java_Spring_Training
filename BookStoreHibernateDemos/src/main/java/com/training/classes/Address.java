package com.training.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addId;
	private int plotNo;
	private String street;
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Address(int plotNo, String street, String city, String state) {
		super();
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddid(int addId) {
		this.addId = addId;
	}
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return addId+" "+plotNo+" "+street+" "+city+" "+state;
	}
	
	

}
