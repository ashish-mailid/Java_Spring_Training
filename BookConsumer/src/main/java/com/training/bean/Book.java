package com.training.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class Book {

	private long isbn;
	private String title;
	private double price;
	private long stock;
	private int qty;
	private double amount;
	
	
}


