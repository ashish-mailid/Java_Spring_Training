package com.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.bean.Book;
import com.training.repo.BookRepo;

@SpringBootApplication
public class SpringBootJpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public void run(String... args) throws Exception {
		
		List<Book> books = bookRepo.findAll();
		System.out.println(books);
	}

}
