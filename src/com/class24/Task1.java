package com.class24;

public class Task1 {
	String name;
	int numb;
	double number,number2,number3;
	
	
	private Task1(String name1) {
		name=name1;
		System.out.println(name);
	}
	protected Task1(int numb1 ) {
		numb=numb1;
		System.out.println(numb1);
	}
	public Task1(double number1) {
		number=number1;
		System.out.println(number1);
	}
	Task1(double num1,double num2){
		number2=num1;
		number3=num2;
		System.out.println(number2+number3);
		
	}
	public static void main(String[] args) {
		Task1 obj1=new Task1("Hello");
	}

}
