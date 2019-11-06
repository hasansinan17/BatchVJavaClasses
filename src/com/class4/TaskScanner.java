package com.class4;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");

		int num1 = keyboard.nextInt();

		if (num1 < 200000) {
			System.out.println("It is accepted!");
		} else {
			System.out.println("it is rejected");
		}
	}

}
