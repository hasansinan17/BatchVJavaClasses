package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {
		/*7 days
		 * if day==1-->Monday
		 * if day==2-->Tuesday
		 *
		 * 
		 */
		int day=3;
		String weekDay;
		if(day==1) {
			weekDay="Monday";
			
		}else if(day==2){
			weekDay="Tuesday";
		}else if(day==3){
			weekDay="Wednesday";
		}else if(day==4) {
			weekDay="Thursdau";
		}else if(day==5) {
			weekDay="Friday";
		}else if(day==6) {
			weekDay="Saturday";
		}else if(day==7) {
			weekDay="Sunday";
		}else {
			weekDay="invalid";
		}
	}

}
