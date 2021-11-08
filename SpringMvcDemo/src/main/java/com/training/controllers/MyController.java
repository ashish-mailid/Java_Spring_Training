package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.bean.OperatorDemo;
import com.training.interfaces.Operator;

@Controller
public class MyController {

	@Autowired
	private OperatorDemo operatorDemo;
	
		//@ResponseBody
		@RequestMapping("/hello")
		public String sayHello(Model map,@RequestParam("username") String username,@RequestParam("password") String password)
		{
			map.addAttribute("username", username);
			return "welcome.jsp";
		}
		
		@RequestMapping("/start")
		public String start()
		{
			return "start.jsp";
		}
		
		@ResponseBody
		@RequestMapping("/operate")
		public String operate()
		{
			return operatorDemo.getResult(12, 23);
		}
}
