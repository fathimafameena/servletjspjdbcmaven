package com.fameena.model;

public class LoginModel {
	String username;
	@Override
	public String toString() {
		return "LoginModel [username=" + username + ", password=" + password + "]";
	}
	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	String password;
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

}
