package com.training.config;

import org.springframework.context.annotation.Bean;

import com.training.bean.AddOperator;
import com.training.bean.MultiplyOperator;
import com.training.bean.MyService1;
import com.training.bean.OperatorDemo;
import com.training.interfaces.Operator;
import com.training.interfaces.ServiceI;

public class MyConfiguration {

	@Bean
	public ServiceI getServiceBean()
	{
		return new MyService1();
	}
	
	@Bean
	public Operator getOperator()
	{
		return new MultiplyOperator();
	}
	

	/*
	 * @Bean public Operator getOperator1() { return new AddOperator(); }
	 */
	
	@Bean
	public OperatorDemo getOperatorDemo()
	{
		return new OperatorDemo();
	}
}




