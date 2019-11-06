package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Class Schedule
		 *if tuesday-->sdlc
		 *if Wednesday-->jave review
		 *if thursday-->sdlc
		 *if saturday-->Java Coding
		 *if sunday-->my faorite java coding
		 */
		
		int day;
		day=1 ;
		
		if(day==2) {
			System.out.println("SDLC Class");
			
		}else if(day==3) {
			System.out.println("JAVA REVIEW");
		}else if(day==4) {
			System.out.println("SDLC Class");
		}else if(day==6) {
			System.out.println("Java Class");
		}else if(day==7) {
			System.out.println("My Favorite Java Coding");
		}else {
			System.out.println("There is no class at school");
		
		}

	}

}
