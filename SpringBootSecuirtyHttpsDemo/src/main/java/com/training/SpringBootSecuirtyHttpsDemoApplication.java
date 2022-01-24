package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootSecuirtyHttpsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecuirtyHttpsDemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to mysite";
	}
}
