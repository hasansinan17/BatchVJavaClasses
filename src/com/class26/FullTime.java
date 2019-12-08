package com.class26;

public class FullTime extends Employee{
	int bonus;
	public void getPaid() {//overriden
		System.out.println("Full time Employee gets paid "+salary+" bonus"+bonus);
		
	}

}
