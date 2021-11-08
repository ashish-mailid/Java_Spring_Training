package com.training.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


//@Profile("test")
@Configuration
public class MyConfiguration {
	
	@Value("${message}")
	private String message;
	
	@Value("${server.port}")
	private String port;

	public String getPort() {
		return port;
	}

	public String getMessage() {
		return message;
	}

	
	
	

}
