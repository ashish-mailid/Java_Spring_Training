package com.training.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.training.services.MyUserDetailsService;

/*class MyPasswordEncoder implements PasswordEncoder
{

	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	
}*/

@Configuration
@EnableWebSecurity
public class MySecurityConfigurationDb extends WebSecurityConfigurerAdapter{

	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	/*
	 * @Bean public PasswordEncoder getPasswordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * does not work for mysql
	 */
	
	@Bean	
	public PasswordEncoder getPasswordEncoder()
	{
		PasswordEncoder encoder = new PasswordEncoder()
				{

					@Override
					public String encode(CharSequence userEntered) {
						
						return userEntered.toString();
					}

					@Override
					public boolean matches(CharSequence userEntered, String encodedPassword) {
						if(userEntered.equals(encodedPassword))
							return true;
						
						return false;
					}
			
				};
		return encoder;
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
		.userDetailsService(myUserDetailsService)
		.passwordEncoder(encoder);
		
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

