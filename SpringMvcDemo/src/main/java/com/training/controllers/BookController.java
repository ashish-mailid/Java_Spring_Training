package com.training.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class BookController {


	@RequestMapping("/test")
	public Book test()
	{
		return new Book("789","sam");
	}
}
