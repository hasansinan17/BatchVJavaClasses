package com.class5;

import java.util.Scanner;

public class MoreLogicalExamples {
	public static void main(String[] args) {
		/*ask user to enter daily sales
		 * based on the sales range we want to give comission to the person
		 * if sales is <100-->comission is 10%
		 * if sales is between 100-200-->comission of 20%
		 * etc...
		 */
		Scanner scan;
		double salesAmount;
		double comission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sles amount");
		salesAmount=scan.nextDouble();
		if(salesAmount<100) {
			comission=salesAmount*0.1;
			
		}else if(salesAmount>=100&&salesAmount<200) {
			comission=salesAmount*0.2;
			
		
		}else if(salesAmount>=200&&salesAmount<500) {
			comission=salesAmount*0.3;
		}else if(salesAmount>=500) {
			comission=salesAmount*0.5;
			
		}else {
			comission=0;
		}
			
		System.out.println("Based on the sales your comission is "+(comission));
	}

}
