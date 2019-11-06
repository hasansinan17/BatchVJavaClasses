package com.class12;

public class StringMiniPulationDemo {
	public static void main(String[] args) {
		String str=new String();
		String name="Jhon";
		System.out.println(name);
		int name1Len=name.length();
		System.out.println(name1Len);
		
		System.out.println("*********************");
		//toLowerCase
		String str1="Hello World";
		System.out.println("Before::"+str1);
		str1=str1.toLowerCase();
		System.out.println("After::"+str1);
		
		System.out.println("////////////////////////////");
		//.equals()
		String str2="HElLo WoRld";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		//to UpperCase();
		String str3="Mohammad";
		System.out.println("Before::"+str3);
		str3=str3.toUpperCase();
		System.out.println("After::"+str3);
		
	}

}
