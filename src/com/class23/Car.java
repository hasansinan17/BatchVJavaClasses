package com.class23;

public class Car {
	/*we want to buld Toyota cars that will have different models and color
	 * 
	 * 
	 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {
		System.out.println("I built "+make+" "+" "+model);
		System.out.println("My car has "+doors+" and my car can have speed up to "+speed);
		
	}

}
