package com.training.services;

import java.util.List;
import java.util.Optional;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.bean.User1;
import com.training.repo.UserRepo;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.springframework.security.core.userdetails.User;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User1> userOp = userRepo.findById(username);
		User1 user1=null;

		if(userOp.isPresent())
		{
			user1 = userOp.get();  // username,password,active,roles
		
		

		List<GrantedAuthority> list ;
		list= Arrays.stream(user1.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());


		return new User(user1.getUsername(), user1.getPassword(), list);
		}
		else
			throw new UsernameNotFoundException("Invalid Credentials");

	}

}


