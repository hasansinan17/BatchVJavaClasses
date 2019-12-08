package com.class31;

public class Classcar {
	public double carPrice;
	public String color;
	public  double calculateSalePrice(double carPrice) {
		this.carPrice=carPrice;
		return carPrice;
		
	}

}
class Sedan extends Classcar{
	double length;

	@Override
	public double calculateSalePrice(double carPrice) {
		// TODO Auto-generated method stub
	if(length>20) {
		
		
		}
		
	}
	
}
