package com.class22;

public class Human {
	String name;
	String lastName;
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	public static void main(String[] args) {
		Human human1=new Human();
		human1.name="John";
		human1.lastName="Smith";
		System.out.println(human1.name);
		System.out.println(human1.lastName);
		System.out.println(Human.eyes);
		System.out.println(human1.nose);
		System.out.println(brain);
		
		
	}

}
