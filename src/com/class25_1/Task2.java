package com.class25_1;

public class Task2 {
	public static void mm() {
		System.out.println("Hi");
	}
	public static void mm(String name) {
		System.out.println(name);
	}
	public static void mm(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.mm();
		obj.mm("hru");
		obj.mm(2);
		
	}

}
