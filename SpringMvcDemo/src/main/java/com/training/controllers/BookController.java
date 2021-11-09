package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

	
	@RequestMapping("/hello")  // http://localhost:8081/SpringMvcDemo/hello
	public String sayHello()
	{
		return "demo.jsp";
	}
	
	
	@ResponseBody
	@RequestMapping("/welcome")  // http://localhost:8081/SpringMvcDemo/hello
	public String welcome(@RequestParam("name") String name)
	{
		
		return "welcome to my page:"+name;
	}
}
