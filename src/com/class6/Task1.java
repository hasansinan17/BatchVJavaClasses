package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale->I am not shopping
		 * if sale->check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20-->apply 10%
		 * if price between 20-100-->20%
		 * if between 100-500-->30%
		 * anything-->50%
		 * 
		 * after discount____the price of the item reduce from ____to___
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a boolean value for sale True/False: ");
		boolean b=scan.hasNextBoolean();
		if(b==true) {
			System.out.println("What is the price?");
			double sale=scan.nextDouble();
			double discount;
			double finalPrice;
			
			
			if(sale<20) {
				discount=sale*0.1;
				
			}else if(sale>=20&&sale<100) {
				discount=sale*0.2;
			}else if(sale>=100&&sale<500) {
				discount=sale*0.3;
			}else {
				discount=sale*0.5;
			}System.out.println(discount);
			
			 
			
			
		}else {
			System.out.println("I am not shopping");
		}
		
		
		
	}

}
