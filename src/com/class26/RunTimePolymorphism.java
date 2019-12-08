package com.class26;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		// creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		//creating an object og child class
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		
		//Non Primitive typecasting
		//widening-> creating an object of the class
		//and giving referance to the Parent class
		Animal obj=new Cat();
		obj.eat();//coming from parent 
		obj.sleep();//this method come from child class-->
		//obj.meow(); compiler error
		
		//narrowing
		//Cat obj2=new Animal();--> Cannot convert from animal to Cat
		
		
	}

}
