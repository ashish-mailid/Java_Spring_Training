package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
		/*
		 * HelloWorld hello = new HelloWorld(); System.out.println(hello.sayHello());
		 */
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	HelloWorld bean1 = (HelloWorld)context.getBean("hello"); // singleton
    	
    	System.out.println(bean1.sayHello());
    	bean1.setMessage("This is an updated message");
    	
    	HelloWorld bean2 = (HelloWorld)context.getBean("hello");
    	System.out.println(bean2.sayHello());
    	bean2.setMessage("This is a new message from bean2");
    	
    	System.out.println(bean1.sayHello());
    	
    	
    	
    }
}
