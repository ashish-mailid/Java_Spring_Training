package com.training.classes;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("customer")
public class Customer extends Person{
	private String email;

	public Customer() {
		super();
	}

	public Customer(long id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString()+" "+email;
	}
	

}
