package com.class2;

public class ArithmaticOperations {
	/*
	 * declare 2 variables and initialize them
	 * perform addition, subtraction, multiplacation and division
	 * 
	 */
	public static void main(String[] args) {
		int num1, num2;
		num1=20;
		num2=10;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		//how can we print value of num1 and num2 together
		System.out.println(num1+" "+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("the addition of two numbers is "+ sum+ " the subtraction of two numbers is "+sub+" the multiplication of two numbers is "
		+mult+" the division of two numbers is "+div);
		
		
	}
	

}
