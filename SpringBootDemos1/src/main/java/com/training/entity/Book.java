package com.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter	
@Setter
@ToString
@Entity
@Table(name = "book")
public class Book {

	@Id // primary key
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long isbn;
	
	@Column(name = "title",length = 50,nullable = false)
	private String title;
	private double price;
	private long stock;
	
	
}
