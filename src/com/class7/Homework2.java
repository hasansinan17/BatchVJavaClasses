package com.class7;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {

		/*
		 * You need to ask user to pay for coffe You need to keep asking user to pay for
		 * it until entered price is ewual =5; After user paid then say
		 * "Enjoy your coffee!"
		 * 
		 */
//		Scanner scan = new Scanner(System.in);
//		int p;
//		do {
//			System.out.println("Pay for your coffe");
//			p=scan.nextInt();
//
//		
//			
//
//			
//			
//		}while(p<5);
//			System.out.println("Enjoy your coffee");
		
//		Scanner scan;
//		int p;
//		p=1;
//		scan=new Scanner(System.in);
//		
//		while(p<5) {
//			System.out.println("Enter a price");
//			p=scan.nextInt();
//			
//		}System.out.println("Enjoy your cofee");
		
		Scanner scan;
		int p;
		p=1;
		scan=new Scanner(System.in);
		
		while(p<5) {
			System.out.println("Enter a price");
			
			p=scan.nextInt();
			System.out.println("you need to pay "+(5-p)+" dollar more!");
			
			if(p>5) {
				System.out.println(p-5+" dollar"+" your change");
			}
			
		}System.out.println("Enjoy your cofee");

	}

}
