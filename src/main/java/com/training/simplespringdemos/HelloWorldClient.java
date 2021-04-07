package com.training.simplespringdemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.simplespringdemos.interfaces.Operator;


public class HelloWorldClient {

	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //loading and creating instance

		/*
		 * HelloBean bean = (HelloBean) context.getBean("hb");
		 * System.out.println(bean.sayHello()); //Sam bean.setName("Peter");
		 * 
		 * System.out.println(bean.hashCode());
		 * 
		 * HelloBean bean1 = (HelloBean) context.getBean("hb");
		 * System.out.println(bean1.hashCode());
		 * 
		 * System.out.println(bean1.sayHello());
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		OperatorBean bean = (OperatorBean) context.getBean("ob");
		System.out.println(bean.operation(12,3));
		
	}

}







