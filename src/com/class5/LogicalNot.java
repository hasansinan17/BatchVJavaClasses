package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		boolean traffic=true;
		if(traffic) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
	
		boolean isRain=false;
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("do not take an umbrellla");
		
			//let's compare 2 numbers using not operator
			int num1=10;
			int num2=10;
			if(num1==num2) {
				System.out.println("Numbers are equal");
				
			}else {
				System.out.println("Numbers are not equal");
				
			if(!(num1==num2)) {
				System.out.println("Numbers are not equal");
				
			}else {
				System.out.println("Numbers are equal");
			}
			
			//if name is not Marry or Anna then you are not my  sister
			String name="Mary";
			String name2="Anna";
			
			if(!(name.equals("Mary")||name2.equals("Anna")));
			System.out.println("You are not my sister");
			
			}
		
		
		}
	
	
	}
	
	
	
	

}
