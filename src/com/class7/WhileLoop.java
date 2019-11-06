package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
		int time=8;
		
		if(time<12){//condition is true
			System.out.println("Good Morning");//code executes 1
			
		}System.out.println("---------------------------------------------------------------------------");

		while(time<12){//if condition is true
			System.out.println("Good Morning");//code executes,//infinitly-->infinite loop
			time++;
			
			
			
		}
		
		//I want to print GM 5 times
		int i=1;
		while(i<6) {
			System.out.println("Good afternon");
			i++;
		}
		System.out.println("Outside of while loop");

		
	}
	
	
	
}
