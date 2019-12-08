package com.class23;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("I am your constructor");
		
	}
	ConstructorDemo(String str)	{
		System.out.println("I am constructor with 1 parameter "+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am constructor with 1 int parameter "+num);
	}
	ConstructorDemo(int num,int num1){
		System.out.println("I am constructor wit 2 int parameters "+num+" "+num1);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println("Code after creating an object");
		obj.hello();
		
		ConstructorDemo obj2=new ConstructorDemo("My parameter");
		ConstructorDemo obj3=new ConstructorDemo(17);
		ConstructorDemo obj4=new ConstructorDemo(17,45);
		
		
		
		
	}
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	public void hello(String str) {
		System.out.println("Hello Class1");
		System.out.println("Hello Instructors1");

}
	}
