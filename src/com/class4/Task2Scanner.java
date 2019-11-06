package com.class4;

import java.util.Scanner;

public class Task2Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How old are you?");
		
		int age=keyboard.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to get a driver licence");}
		
		else {
			System.out.println("You are eligible to get a permit licence");}
		
		
		

	}
}
