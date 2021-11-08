package com.training;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	@GetMapping("/")
	public String sayHelloOauth2(Principal principal)
	{
		return principal.getName()+" Welcome Oauth2 Cloud";
	}
}
