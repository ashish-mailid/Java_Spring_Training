package com.training.classes;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="person2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	public Person2() {
		super();
	}

	public Person2(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id+" "+name;
	}
	
}
