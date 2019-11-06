package com.class8;

import java.util.Scanner;

public class TaskBreakAndContinue {
	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
				
			}System.out.println(i);
		}
		
		Scanner scan=new Scanner(System.in);
		boolean c;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Apply for a credit card");
			c=scan.nextBoolean();
			if(c) {System.out.println("Great! Follow ");
				break;
			}
			
		}
	}


}
