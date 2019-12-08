package com.class29;

public abstract class Vehicle {
	public void drive() {
		System.out.println("Vehicle can drive");
	}
	public void stop() {
		System.out.println("Vehicle can stop");
	}
	public abstract void start();
	public abstract void speed();

}
abstract class Car extends Vehicle{
	public void start(){
		System.out.println("Car can start");
	}
}
class BMW extends Car{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("BMW can speed very high");
	}
	
}
