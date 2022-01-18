package com.training.bean;

import com.training.interfaces.ServiceI;

public class MyService1 implements ServiceI {

	@Override
	public String sayHelloService() {
		
		return "This is myservice 1";
	}

}
