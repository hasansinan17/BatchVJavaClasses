package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		/*ask user to enter the month they were born
		 * based on the monthdefine the season
		 * if user is born in jan,feb,dec-->winter
		 * if mat,apr,may-->spring
		 * if jun,jul,aug
		 * if sep,oct,nov-->
		 * otherwise-->unknown
		 * at the end of the program 
		 * "you were born in___
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter what month you were born: ");
	String month=scan.nextLine();
	String season;
	if(month.equals("December")||month.equals("January")||month.equals("February")) {
		season="Winter";
	}else if(month.equals("March")||month.equals("April")||month.equals("May")) {
		season="Spring";
	}else if(month.equals("June")||month.equals("July")||month.equals("August")) {
		season="Summer";
	}else if(month.equals("September")||month.equals("October")||month.equals("November")) {
		season="Autumn";
	}else {
		season="Unknown";
	}System.out.println("you were born in "+season);
	 System.out.println(month);
	
	
	}
	

}
