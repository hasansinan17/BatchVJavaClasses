package com.class13;

public class RegularExpression {
	public static void main(String[] args) {
		String str="14234Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		System.out.println("*****************************");
		
		
		//Remove everything except text
		
		String str2="Hi#$%How#$%#$4356346";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		String str1="12-22-1990";
		System.out.println(str.replace('-', '/'));
		
		
		
		
		
	}

}
