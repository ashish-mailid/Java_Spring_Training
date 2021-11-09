package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;
import com.training.bean.OperatorDemo1;
import com.training.config.MyConfiguration;


public class App3 
{
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    	OperatorDemo1 opBean  = (OperatorDemo1) context.getBean(OperatorDemo1.class);
    	System.out.println(opBean.execute(12, 7));
    	
    }
}
