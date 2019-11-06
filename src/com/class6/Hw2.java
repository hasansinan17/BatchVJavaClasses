package com.class6;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 different number: ");
		double a,b,c;
		double max;
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		if(a>b||c>b) {
			if(a>c) {
				max=a;
			}else {max=c;
			
		}
			
	}else {
		max=b;
	
	}	System.out.println("Maximum is "+max);

}
}