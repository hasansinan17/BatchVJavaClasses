package com.class31;

public interface shape {
	public void calculateArea();
	public void calculatePerimeter();

}
class Circle implements shape{
	public double r,pi;
	

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
		double a=pi*r*r;
		System.out.println(a);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double p=2*pi*r;
		System.out.println(p);
		
		
	}
	
	
}
class Rectangle implements shape{
	double w,l;

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double a=w*l;
		System.out.println(a);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double p=2*(w+l);
		System.out.println(p);
		
	}
	
}
