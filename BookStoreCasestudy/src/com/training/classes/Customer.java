package com.training.classes;

public class Customer implements User{
private String name;
private String email;
private String phoneNo;
private String username;
public Customer(String name, String email, String phoneNo, String username) {
	super();
	this.name = name;
	this.email = email;
	this.phoneNo = phoneNo;
	this.username = username;
}
public Customer() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", username=" + username + "]";
}



}
