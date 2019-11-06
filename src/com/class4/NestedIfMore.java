package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * check age, if age is less than 16-->you are too young to drive otherwise you
		 * are eligibla to drive we will check if you are older than 18--> you can get
		 * driver licence and if not you can get learner permit
		 * 
		 */
		int age;
		age = 55;
		if (age < 16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are eligible to drive");
			if (age >= 18) {
				System.out.println("You can drive alone");
			} else {
				System.out.println("You need your parents to drive");
			}
		}

	}
	}


