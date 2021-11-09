package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.bean.AddOperator;
import com.training.bean.FilePrinter;
import com.training.bean.MultiplyOperator;
import com.training.bean.MultiplyOperator1;
import com.training.bean.OperatorDemo1;
import com.training.interfaces.Operator;
import com.training.interfaces.Operator1;
import com.training.interfaces.Printer;

@Configuration
public class MyConfiguration {
	
	//configure OperatorDemo1
	
	@Bean
	public OperatorDemo1 getOperatorDemo()
	{
		return new OperatorDemo1();
	}

	
	  @Bean public Operator1 getOperator() { return new MultiplyOperator1(); }
	  
	  
	  @Bean
	  public Printer getPrinter()
	  {
		  return new FilePrinter();
	  }
	 
}
