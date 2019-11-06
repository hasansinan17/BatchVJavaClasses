package com.class8;

public class Task2 {
	public static void main(String[] args) {
		/*
		 * write a code to find the sm of even&odd numbers
		 * from range 1 to 20
		 * expecting 2 outputs
		 * sum for odd nums=...
		 * sum for even nums=...
		 */
			int sum=0;
		for(int i=2; i<=20; i+=2 ) {
			sum=sum+i;
			
		}System.out.println(sum);
		
		System.out.println("*****************************************************************");
		
		int sum1=0;
		for(int i=1; i<20; i+=2) {
			sum1=sum1+i;
		}System.out.println(sum1);
	System.out.println("*************************************************************************");	
		int sum2=0;
		for(int i=2; i<=20; i++) {
			if(i%2==0) {
				sum2=sum2+i;
			}
		}
		System.out.println(sum2);	
		System.out.println("***************************************************************************");
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("The total of all even#="+sumEven);
		System.out.println("The total of all odd#="+sumOdd);
		System.out.println("******************************************************************************");
	}

}
