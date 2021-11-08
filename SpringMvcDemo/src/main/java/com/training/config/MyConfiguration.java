package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.training.bean.AddOperator;
import com.training.bean.MultiplyOperator;
import com.training.bean.MyFileWriter;
import com.training.bean.OperatorDemo1;
import com.training.controllers.MyController;
import com.training.interfaces.Operator;
import com.training.interfaces.PrintInterface;


@ComponentScan("com.training.*")
public class MyConfiguration extends WebMvcConfigurerAdapter {
	
	public void  configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		  configurer.enable(); }

		
		  @Bean 
		  public Operator getOperator() { return new MultiplyOperator(); }
		  
		  @Bean
		  public PrintInterface getPrint()
		  {
			  return new MyFileWriter();
		  }
		 
}







