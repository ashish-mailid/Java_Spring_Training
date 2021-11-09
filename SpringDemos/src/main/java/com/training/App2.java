package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;


public class App2 
{
    public static void main( String[] args )
    {
        
    	// Get the Spring Application Context 
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
    	OperatorDemo opBean = (OperatorDemo) context.getBean("demo");
    	
    	System.out.println("Result:"+opBean.execute(12, 34));
    	
    	
    	OperatorDemo opBean1 = (OperatorDemo) context.getBean("demo");
    	
    	System.out.println(opBean1.execute(2, 3));
    	
    	context.registerShutdownHook();
    }
}
