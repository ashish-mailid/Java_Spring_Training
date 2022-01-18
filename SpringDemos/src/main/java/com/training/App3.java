package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;
import com.training.config.MyConfiguration;
import com.training.interfaces.Operator;
import com.training.interfaces.ServiceI;

/**
 * Hello world!
 *
 */
public class App3 
{
    public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

	ServiceI serviceI = (ServiceI) context.getBean(ServiceI.class);
	
	System.out.println(serviceI.sayHelloService());
    	
	OperatorDemo op = (OperatorDemo)context.getBean(OperatorDemo.class);
	System.out.println(op.getResult(12, 34));
    }
    
    
}
