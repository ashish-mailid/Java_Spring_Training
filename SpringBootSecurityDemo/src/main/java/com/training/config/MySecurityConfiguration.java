package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	//authentication
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		PasswordEncoder encoder = getPasswordEncoder();
		String userPassword = encoder.encode("user1");
		String adminPassword = encoder.encode("admin123");
		
		System.out.println(userPassword);
		System.out.println(adminPassword);
		
		auth
		.inMemoryAuthentication()
		.withUser("user1")
		//.password("{noop}user1")
		.password(userPassword)
		.roles("USER")  // ROLE_USER
		.and()
		.withUser("admin")
		//.password("{noop}admin123")
		.password(adminPassword)
		.roles("ADMIN");
		
	}
	
	//Authorization
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
		.authorizeRequests()
		.antMatchers("/","/hello")
		.permitAll()
		.and()
		.authorizeRequests()
		.antMatchers("/hello/user/**")
		.hasAnyRole("USER","ADMIN")
		.and()
		.authorizeRequests()
		.antMatchers("/hello/admin")
		.hasRole("ADMIN")
		.and()
		.formLogin();
		
	}
}
