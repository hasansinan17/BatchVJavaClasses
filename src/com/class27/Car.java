package com.class27;

public class Car {
	String make,model;
	int year;
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	public void display() {
		System.out.println("We build "+year+" "+make+" "+model);
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.display();
		
		//int num;--> local variables must be initialized
		//System.out.println(num);
	}

}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		System.out.println("Non argument constructor of the child class");
	}
}
