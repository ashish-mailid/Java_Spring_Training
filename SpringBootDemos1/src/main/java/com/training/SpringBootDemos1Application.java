package com.training;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.message.StringFormatterMessageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.config.MyConfiguration;
import com.training.entity.Address;
import com.training.entity.Book;
import com.training.entity.User;
import com.training.repo.AddressRepo;
import com.training.repo.BookRepo;
import com.training.repo.UserRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
// boostrapper 
@SpringBootApplication   // configuration,component scan
public class SpringBootDemos1Application implements CommandLineRunner{
	
	
	  @Autowired private BookRepo bookRepo;
	/* 
	 * @Autowired private UserRepo userRepo;
	 * 
	 * @Autowired private AddressRepo addressRepo;
	 */
	

	@Autowired
	private MyConfiguration config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemos1Application.class, args);
	}

	
	  @PostConstruct 
	  public void init() { 
		  bookRepo.save(new Book(1234, "C", 125.25,100));
		  bookRepo.save(new Book(4567, "CPlus",225.25,100));
	  
	  }
	 
	
	@Override
	public void run(String... args) throws Exception {
	System.out.println("I am in command line runner");
		
	System.out.println(config.getMessage());
	
	System.out.println("on port:"+config.getPort());
	
	
	/*
	 * System.out.println("---------------Books----------------");
	 * System.out.println(bookRepo.findAll());
	 * System.out.println("-------------book based on isbn--------------");
	 * 
	 * Optional<Book> opBook = bookRepo.findById(8975l); if(opBook.isPresent())
	 * System.out.println(opBook.get());
	 * 
	 * System.out.println("---------------------------------------");
	 * System.out.println(bookRepo.findByTitle("C"));
	 * 
	 * System.out.println(bookRepo.findByStock(100));
	 * 
	 * System.out.println(bookRepo.findByStockGreaterThan(80));
	 * 
	 * System.out.println(bookRepo.findByTitleLike("%th%"));
	 * 
	 * System.out.println(bookRepo.findByStockGt(80));
	 * 
	 * System.out.println(bookRepo.findByTitleAndStock("C", 100));
	 * 
	 * System.out.println(bookRepo.updateStockGt(150, 90));
	 */
	
	/*
	 * Address address1 = new Address(); address1.setCity("Bangalore");
	 * address1.setStreet("Church St");
	 * 
	 * User user1=new User(); user1.setName("Sam");
	 * 
	 * user1.setDob(new java.util.Date(1998, 10, 12)); user1.setAddress(address1);
	 * 
	 * //addressRepo.save(address1); userRepo.save(user1);
	 */
		
	/*
	 * List<User> users = userRepo.findAll(); System.out.println(users);
	 * 
	 * User user = userRepo.findById(9).get(); System.out.println(user);
	 */
	   
	}

	
}
