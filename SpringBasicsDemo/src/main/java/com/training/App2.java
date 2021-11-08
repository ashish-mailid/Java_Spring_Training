package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;
import com.training.interfaces.Operator;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        //look up
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
    	
    	OperatorDemo bean1 = (OperatorDemo) context.getBean("demo");  // instance of HelloWorld 
    	bean1.getResult(23, 12);
    	
    	System.out.println(bean1.getMessage());
    	
    	bean1.setMessage("new Message 1");
    	
    	System.out.println(bean1.getMessage());
    	
    	OperatorDemo bean2 = (OperatorDemo) context.getBean("demo"); 
    	// gets the same object that is already created because it is singleton by default
    	System.out.println(bean2.getMessage());
    	
    	System.out.println(bean2.getCountries());
    	
    	context.registerShutdownHook();
    	
    	
    }
}
