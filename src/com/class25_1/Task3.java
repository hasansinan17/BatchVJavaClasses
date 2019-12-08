package com.class25_1;

public class Task3 {
	private void mm() {
		System.out.println("Hi There!");
	}
	private void mm(String name) {
		System.out.println(name);
	}
	private void mm(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.mm();
		obj.mm("Hafsa and Azra");
		obj.mm(8);
	}

}
