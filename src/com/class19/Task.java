package com.class19;

public class Task {
	String createEmail(String name,String lastname,String emailType) {
		String email;
		email=name+lastname+"@"+emailType+".com";
		return email;
		
		
	}
	public static void main(String[] args) {
		Task e=new Task();
		String email=e.createEmail("hasan", "kaptan", "gmail");
		System.out.println(email);
	}
	
	
	

}
