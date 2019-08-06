package com.store.interfaces;

import com.store.classes.User;

public interface UserDaoI {
	
	public User validateUser(String email,String password);

}
