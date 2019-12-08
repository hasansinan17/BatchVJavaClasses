package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
	public static void main(String[]args) {
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		String scannerString=scan.nextLine();
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
	}
	void myMethod() {
		System.out.println("This is user defined method that I created");
	}

}
