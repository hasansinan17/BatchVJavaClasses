package com.class31;

public class RegistrationClass {
	private String email,userName,password;
	public String getEmail() {
			
			return email;
		
		
	}
	public void setEmail(String email) {
		if(email.contains("gmail")) {
			this.email=email;
			
		}
		else {
			System.out.println("Email must be gmail");
		}
		
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(userName.length()>6) {
			this.userName=userName;
		}
		else {
			System.out.println("Username must be more than 6 characters");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.contains(userName)||password.length()<=6) {
			System.out.println("username cannot be password and must be more than 6 characters");
		}
		else {
			this.password=password;
		}
	}

}
