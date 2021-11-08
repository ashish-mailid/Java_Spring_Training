package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;
import com.training.bean.OperatorDemo1;
import com.training.config.MyConfiguration;
import com.training.interfaces.Operator;

/**
 * Hello world!
 *
 */


public class App3 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
       OperatorDemo1 op= context.getBean(OperatorDemo1.class);
       op.getResult(12, 23);
    	
    	
    }
}





