package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
       
		/*
		 * HelloWorld hello = new HelloWorld(); System.out.println(hello.sayHello());
		 */
    
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
    	OperatorDemo bean1 = (OperatorDemo)context.getBean("demo"); // singleton
    	
    	System.out.println("Result ="+bean1.getResult(12, 23));
    	
    	
    	OperatorDemo bean2 = (OperatorDemo)context.getBean("demo"); // singleton
    	
    	System.out.println("Result ="+bean1.getResult(12, 23));
    	
    	//System.out.println(bean1.getAddressList());
    	
    	context.registerShutdownHook();
    }
}
