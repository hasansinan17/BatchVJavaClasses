package com.class6;

public class Recap {
	public static void main(String[] args) {
		/*declare the time (1-24)
		 * based on the time identify whether it morning, afternon, evenning or night
		 * if 1-11->morning
		 * if 12-15->noon
		 * if 16-20->evenning
		 * if >20->night
		 */
		
		int time=56;
		String timeOfDay;
		
		if(time>=1&&time<=11) {
			timeOfDay="Morning";
		}else if(time>=12&&time<=15) {
			timeOfDay="Noon";
		}else if(time>=16&&time<20) {
			timeOfDay="Evenning";
		}else if(time>20&&time<=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Unknown";
		}System.out.println("Time of the day is "+timeOfDay);
	
		if(timeOfDay.equals("Morning")) {
			System.out.println("Good Morning");
		}
	}

}
