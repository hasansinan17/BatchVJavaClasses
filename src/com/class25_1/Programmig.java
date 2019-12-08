package com.class25_1;

public class Programmig {
	public void pg() {
		System.out.println("I love programming languages");
	}
	public void pg(String name) {
		System.out.println("I love "+name);
	}
	public static void main(String[] args) {
		Programmig obj=new Programmig();
		obj.pg();
		obj.pg("Java");
		
	}

}
