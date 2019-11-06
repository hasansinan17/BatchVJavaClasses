package com.class14;

public class StringMethodRecap {
	public static void main(String[] args) {
		//.replace
		String str="Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		System.out.println("******************");
		
		System.out.println(str.replace("your", "My"));
		
		System.out.println("****************************");
		
		//.replaceAll
		
		String str2="no pain no gain";
		System.out.println();
		
		System.out.println("/////////////////////////////////////");
		String str3="23423Hell3049o";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^A-z]", ""));
		System.out.println("////////////////////////////////////////");
		
		System.out.println(str2.replaceFirst(" ",""));
		
		
		
		
		
	}

}
