package com.class5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your height");
		int h=scan.nextInt();
		if(h<5) {
			System.out.println("short");
		}else if(h>=5&&h<=6) {
			System.out.println("medium");
		}else if(h>6) {
			System.out.println("tall");
		}else {
			System.out.println("not valid");
		}
	}

}
