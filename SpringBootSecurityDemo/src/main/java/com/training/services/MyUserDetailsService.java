package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.bean.MyUser;
import com.training.repo.UserRepo;
import java.util.Arrays;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<MyUser> userOp = userRepo.findById(username);
		if(userOp.isEmpty())
				  return null;
		else
		{
			MyUser user = userOp.get();
			String password = user.getPassword(); // from db 
			String roles = user.getRoles() ; // ROLE_USER,ROLE_ADMIN
			
			/*String[] rolesArray = roles.split(",");
			
			
			 * List<SimpleGrantedAuthority> listRoles = new ArrayList<>();
			 * 
			 * for(String role : rolesArray) { listRoles.add(new
			 * SimpleGrantedAuthority(role)); }
			 */
			
			List<SimpleGrantedAuthority> listRoles = Arrays.stream(roles.split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
			
			return new User(username, password, listRoles) ;
		}
	}

}
