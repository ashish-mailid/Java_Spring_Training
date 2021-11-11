package com.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.training.services.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurationDb extends WebSecurityConfigurerAdapter{

	@Autowired
	private MyUserDetailsService userDetailsService;

	//authentication
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());

	}
	@Bean 
	public PasswordEncoder passwordEncoder() { 

		return new PasswordEncoder()
		{
			@Override 
			public String encode(CharSequence userEnteredPassword) { 
				return userEnteredPassword.toString(); }

			@Override 
			public boolean matches(CharSequence userEnteredPassword, String password) {
				System.out.println("userEnteredPassword "+userEnteredPassword);
				System.out.println("password"+password);
				if(password.equals(userEnteredPassword))	
					return true; 
				return false;

			} }; }

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
