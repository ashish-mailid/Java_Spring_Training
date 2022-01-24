package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	
	  @GetMapping({"/","/hello"}) 
	  public String sayHello() { return
	  "Hello! Welcome to my Site"; }
	 
	
	@GetMapping("/hello/user/welcome")
	public String sayHelloUser()
	{
		return "Hello user! Welcome to my site";
	}
	
	@GetMapping("/hello/user/userhome")
	public String homeUser()
	{
		return "This is User Home";
	}
	
	@GetMapping("/hello/admin")
	public String sayHelloAdmin()
	{
		return "Hello Admin! Welcome to my site";
	}
	
}
