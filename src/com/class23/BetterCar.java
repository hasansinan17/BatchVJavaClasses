package com.class23;

public class BetterCar {
	/*we want to buld Toyota cars that will have different models and color
	 * 
	 * 
	 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	BetterCar(String carModel,String carColor,int carSpeed,int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		}
	
	public static void main(String[] args) {
		make="BMW";
		BetterCar bcar1=new BetterCar("X5","Green",400,6);
		bcar1.getDetails();
				
		
	}
	
	public void getDetails() {
		System.out.println("I built "+make+" "+" "+model);
		System.out.println("My car has "+doors+" doors and my car can have speed up to "+speed);
		
		
		}

}
	
