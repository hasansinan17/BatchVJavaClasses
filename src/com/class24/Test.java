package com.class24;

public class Test {
	public static void main(String[] args) {
		Child1 child1=new Child1();
		System.out.println(child1.race);
		System.out.println(child1.eyeColor);
		System.out.println(child1.hairColor);
		
		child1.sing();
		child1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.eyeColor);
		System.out.println(parent.hairColor);
		parent.sing();
		System.out.println(Parent.race);
		
		
		
		
	}

}
