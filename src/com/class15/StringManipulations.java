package com.class15;

import java.util.Scanner;

public class StringManipulations {
	public static void main(String[] args) {
//		String class comes in java lang package
//		2 ways to craete a string
//		first way
		String str="Hello";
//		second
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
//		find the number of characters inside the string
		int length=str.length();
//		case conversions methods/functions
		str=str.toLowerCase().toUpperCase();
		System.out.println(str);//HELLO
		

		
//		lets ask user to enter broeser
//		based on the input we say "Your selected browser is "__________
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=scan.nextLine();
		switch(browser) {
		case "firefox":
			System.out.println("Execution be performed on "+browser);
			break;
		case "ie":
			System.out.println("Execution be performed on "+browser);
			break;	
		case "chrome":
			System.out.println("Execution be performed on "+browser);
			break;
		case "safari":
			System.out.println("Execution be performed on "+browser);
			break;
			default:
				System.out.println("Please enter valid browser");
			
		}
		
		
	}
	
	

}
