package com.training.map;
/*
 * 1.      Create a Map of Account.
2.	Account has username,password,email,status (boolean)

basic operations on Map

1.	adding an account
2.      remove an account based on username
3.      to activate /deactivate the account
4       view all the accounts.
5	authenticate the user


 */
public class Account {
	private String username;
	private String password;
	private String email;
	private boolean status;
	public Account() {
		super();
	}
	public Account(String username, String password, String email, boolean status) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return username+" "+email+" "+status;
	}
	
	

}
