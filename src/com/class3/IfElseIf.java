package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=99;
		if(num1>num2) {
			System.out.println("Num1 is larger than num2");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
		int num3=100;
		int num4=100;
		if(num3>num4) {
			System.out.println("Num3 is larger than num4");
		}else if(num3==num4) {
			System.out.println("Num3 is equal to num4");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
		
		int day=6;
		if(day==1) {
			System.out.println("Today is Monday. I have to go to work");
		}else if(day==2) {
			System.out.println("Today is Tuesday. I have SDLC class");
			
		}else if(day==3){
			System.out.println("Today is Wednesday. I have Java Review Class");
		}else if(day==4){
			System.out.println("Today is Thursday");
		}
	}

}
