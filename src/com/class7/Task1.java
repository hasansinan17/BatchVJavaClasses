package com.class7;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 As long as it is workDay print "I do not need a day off" and
		 * increase day once day is 6 print "I do not need a day off any more"
		 */

		boolean workDay = true;
		int day = 1;
		while (workDay) {
			if (day == 6) {
				workDay = false;
				System.out.println("I do not need a day off anymore");
			} else {
				System.out.println("I need a day off");
			}
			day++;

		}System.out.println("------------------------------------------------------------------------------");
		boolean workday=true;
		int d=5;
		while(workday) {
			if(d==6||day==7) {
				workday=false;
				System.out.println("I do not need a day off any more");
			}else {
				System.out.println("I need a day off");
			}
			d++;
		}System.out.println("============================================================================");
		Boolean workDay1=true;
	    int y=1;
	    while (workDay1) {
	        System.out.println("I need a day off");
	    if (y==6) {
	        System.out.println("I do not need a day off any more");
	        workDay1=false;
	        }
	        y++;
		
	}

	
	
	
    
	

}}
