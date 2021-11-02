package com.training.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name="customer2")
public class Customer2 extends Person2 {
	private String email;

	public Customer2() {
		super();
	}

	public Customer2(long id, String name, String email) {
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
