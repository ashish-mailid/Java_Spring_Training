package com.training;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.bean.MyUser;
import com.training.repo.UserRepo;

@SpringBootApplication
public class SpringBootSecurityDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

	@Autowired
	private UserRepo repo;
	
	@PostConstruct
	public void addUsers()
	{
	repo.save(new MyUser("user1", "user@123", true, "ROLE_USER"));	
	}
	@Override
	public void run(String... args) throws Exception {
		
		
	}

	
}
