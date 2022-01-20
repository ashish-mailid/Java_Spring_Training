package com.training.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ConfigurationProperties("number")
public class MyConfig {

	@Value("${message}")
	private String message;


	/*
	 * private String max;
	 * 
	 * 
	 * public void setMax(String max) { this.max = max; }
	 */


	public String getMessage()
	{
		return message;
	}

	/*
	 * public String getMax() { return max; }
	 */
}
