package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class TestController {

	@GetMapping("/sayhello")
	public String sayHelloAll()
	{
		return "Hello All";
	}
	
	@GetMapping("/user/sayhellouser")
	public String sayHelloUser()
	{
		return "Hello User";
	}
	
	@GetMapping("/admin/sayhelloadmin")
	public String sayHelloAdmin()
	{
		return "Hello Admin";
	}
}
