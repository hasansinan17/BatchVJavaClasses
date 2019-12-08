package com.class17;

public class Dog {
	//define attributes/features
//	String make,model,color;
//	int year,wheels,windows,speed;
//	//adding behavior/action-->methods();
//	void drive() {
//		System.out.println("Car "+make+" can drive");
//	}
//	void start() {
//		System.out.println("Car "+make+" can start");
//	}
//	void accelerate() {
//		System.out.println("Car "+make+" can accelerate");
//	}
	
	String breed, color,gender;
	int leg;
	boolean tail;
	
	void bark(){
		System.out.println(breed+" can bark.");
		
	}
	void company(){
		System.out.println(breed+" are good friends");
		
	}
	void sacrifice() {
		System.out.println(breed+" has sacrifice");
	}
	public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.breed="Husky";
		Husky.color="White";
		Husky.gender="Female";
		Husky.leg=4;
		Husky.tail=true;
		Husky.bark();
		Husky.company();
		Husky.sacrifice();
		
		Dog Bulldog=new Dog();
		Bulldog.breed="Bulldog";
		Bulldog.color="Grey";
		Bulldog.gender="Female";
		Bulldog.leg=4;
		Bulldog.tail=true;
		Bulldog.bark();
		Bulldog.company();
		Bulldog.sacrifice();
		
		Dog Labrador=new Dog();
		Labrador.breed="Labrador";
		Labrador.color="Black";
		Labrador.gender="Male";
		Labrador.leg=4;
		Labrador.tail=true;
		Labrador.bark();
		Labrador.company();
		Labrador.sacrifice();
	}
	
	

}
