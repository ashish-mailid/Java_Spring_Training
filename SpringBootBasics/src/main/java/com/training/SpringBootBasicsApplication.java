package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.training.config.MyConfig;
import com.training.interfaces.MyProfile;


@SpringBootApplication
public class SpringBootBasicsApplication  implements CommandLineRunner{

	@Autowired
	private MyConfig config;
	
	@Autowired
	private MyProfile profile;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootBasicsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(config.getMessage());
		//System.out.println(config.getMax());
		
		//SpringApplicationBuilder builder = new SpringApplicationBuilder();
		//builder.profiles("prod");
		profile.process();
		
	}
	
	/*
	 * protected SpringApplicationBuilder configure(SpringApplicationBuilder
	 * builder) { return builder.sources(SpringBootBasicsApplication.class); }
	 */

}
