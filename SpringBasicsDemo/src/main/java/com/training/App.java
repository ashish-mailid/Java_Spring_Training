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
        //look up
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld bean1 = (HelloWorld)context.getBean("bean1");  // instance of HelloWorld 
    	System.out.println(bean1.sayHello());
    	
    }
}
