package com.class31;

public class TestShape {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.pi=3.14;
		circle.r=3;
		circle.calculateArea();
		circle.calculatePerimeter();
		
		Rectangle rectangle=new Rectangle();
		rectangle.w=3;
		rectangle.l=4;
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		
	}

}
