package com.class9;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int startPoint, endPoint, sumEven, sumOdd;
		sumEven=0;
		sumOdd=0;
		System.out.println("put your start point");
		startPoint=sc.nextInt();
		System.out.println("put your end point");
		endPoint=sc.nextInt();
		for(int i=startPoint; i<=endPoint; i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}System.out.println("Sum of the even numbers: "+sumEven);
		System.out.println("Sum of the odd numbers:"+sumOdd);
		
		
		
		

	}

}
