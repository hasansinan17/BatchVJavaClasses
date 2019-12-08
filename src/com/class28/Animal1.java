package com.class28;

public class Animal1 {
	void eat() {
		System.out.println("eating...");
	}

}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("eating bread");
	}
	void bark() {
		System.out.println("barking...");
	}
	void performance() {
		super.eat();
		bark();
	}
}
