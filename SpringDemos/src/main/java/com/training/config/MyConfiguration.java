package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.bean.AddOperator;
import com.training.bean.MultiplyOperator;
import com.training.bean.OperatorDemo1;
import com.training.interfaces.Operator;

@Configuration
public class MyConfiguration {
	
	//configure OperatorDemo1
	
	@Bean
	public OperatorDemo1 getOperatorDemo()
	{
		return new OperatorDemo1();
	}

	
	@Bean
	public Operator getOperator()
	{
		return new MultiplyOperator();
	}
}
