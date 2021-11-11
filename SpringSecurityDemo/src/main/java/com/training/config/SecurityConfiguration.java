package com.training.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	//authentication
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth
		.inMemoryAuthentication()
		.withUser("user")
		.password("{noop}user123")
		.roles("USER")
		.and()
		.withUser("admin")
		.password("{noop}admin123")
		.roles("ADMIN");
		
	}
		
	//authorization
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity
		.authorizeRequests()
		.antMatchers("/hi/sayhello")
		.hasAnyRole("USER","ADMIN")
		.and()
		.authorizeRequests()
		.antMatchers("/hi/user/**")
		.hasRole("USER")
		.and()
		.authorizeRequests()
		.antMatchers("/hi/admin/**")
		.hasRole("ADMIN")
		.and()
		.formLogin();
		
	}
	
}
