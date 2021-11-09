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
        
    	// Get the Spring Application Context 
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	HelloWorld helloBean = (HelloWorld) context.getBean("hello");
    	
    	System.out.println(helloBean.sayHello());
    	
    }
}
