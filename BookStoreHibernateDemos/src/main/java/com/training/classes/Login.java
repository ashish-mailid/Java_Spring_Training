package com.training.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usersnew")
public class Login {

	@Id  
	@Column(length = 200) //primary key
	private String username;
	
	@Column(name = "pwd")
	private String password;
	
	private String role;
	public Login() {
		super();
	}
	public Login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return username+" "+password+" "+role;
	}
	
	
}
