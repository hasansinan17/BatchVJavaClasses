package com.class4;

import java.util.Scanner;

public class Task3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your  city?");
		String s = keyboard.nextLine();

		System.out.println("enter temperture");
		int t = keyboard.nextInt();

		int convertedTemp = (t - 32) * 5 / 9;

		System.out.println("The temperture of the " + s + " is " + convertedTemp + ".");

	}

}
