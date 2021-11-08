package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.bean.AddOperator;
import com.training.bean.ConsoleWriter;
import com.training.bean.MultiplyOperator;
import com.training.bean.MyFileWriter;
import com.training.bean.OperatorDemo;
import com.training.bean.OperatorDemo1;
import com.training.interfaces.Operator;
import com.training.interfaces.PrintInterface;

// Configuration class
@Configuration
public class MyConfiguration {
	
	@Bean
	public Operator getOperator()
	{
		return new AddOperator();
	}
	
	@Bean
	public PrintInterface getPrint()
	{
		return new MyFileWriter();
	}
	
	@Bean
	public OperatorDemo1 getOperatorDemo() // target
	{
		return new OperatorDemo1();
	}
	

}
