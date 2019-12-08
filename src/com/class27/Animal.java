package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}
class Monkey extends Animal{
	//cannot override static methods with instance methods
	//public void ehoAmI(){
	//
	//}
	//we cannot override static methods
	//when both methods are static within subclass and parent
	//method hiding
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
