package com.class6;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 3 distinct number: ");
	
	double a,b,c;
	double max;
	a=scan.nextDouble();
	b=scan.nextDouble();
	c=scan.nextDouble();
	if(a>b&&a>c) {
		max=a;
	}else if(b>c) {
		max=b;
	}else {
		max=c;
	}
	
		System.out.println("Maximum number is "+max);
		
	}

}
