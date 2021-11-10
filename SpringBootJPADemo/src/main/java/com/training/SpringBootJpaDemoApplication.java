package com.training;

import java.util.List;

import javax.annotation.PostConstruct;

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

	@PostConstruct
	public void init()
	{
		bookRepo.save(new Book("6788", "Rich Dad Poor Dad", 120.50, 100, "Motivational"));
		bookRepo.save(new Book("3459", "Who Moved my Cheese", 180.50, 100, "Motivational"));
		bookRepo.save(new Book("1245", "Alchemist", 190.50, 100, "Motivational"));
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Book> books = bookRepo.findAll();
		System.out.println(books);
	}

}
