package com.class31;

public class TestRegistration {
	public static void main(String[] args) {
		RegistrationClass obj=new RegistrationClass();
		
		obj.setEmail("hasankaptan@gmail.com");
		String email=obj.getEmail();
		obj.setUserName("hasankaptan");
		String username=obj.getUserName();
		obj.setPassword("hasankapta");
		String password=obj.getPassword();
		
		System.out.println("Email "+email);
		System.out.println("Username "+username);
		System.out.println("Password "+password);
		
		
		
		
		
		
	}

}
