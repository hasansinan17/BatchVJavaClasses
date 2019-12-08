package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str1){
		this();
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str2,String str3){
		this(str2);
		System.out.println("I am constructor with 2 String parameters");
		
	}
	public static void main(String[] args) {
		ThisWithConstructor obj1=new ThisWithConstructor("Hello");
		ThisWithConstructor obj2=new ThisWithConstructor("Hello","bye");
	}

}
