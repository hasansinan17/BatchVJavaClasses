package com.class22;

public class LocalVariables {
	public static void main(String[] args) {
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		String createEmail=obj.createEmail("hasan", "kaptan", "gmail");
		System.out.println(createEmail);
		
		
	}
	void sayName() {
		String myName="John";
		System.out.println(myName);
	}
	String createEmail(String name,String lastName,String email) {
		String createEmail=name+lastName+"@"+email+".com";
		return createEmail;
	}

}
