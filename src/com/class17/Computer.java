package com.class17;

public class Computer {
//	Class Computer:
//		featutes/attributes: keyboard,screen,monitor,mouse,name,brand,ram,memory
	String name,brand;
	boolean keyboard,monitor,mouse;
	int screen,ram,memory;

	void playGames() {//method header
		//method body
		System.out.println("I can play on my "+name);
	}
	void javaCoding() {
		System.out.println("I can do java coding on my "+name);
	}
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	///////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();
		System.out.println("**************************");
		Computer comp2=new Computer();
		comp2.brand="Dell";
		comp2.name="420";
		comp2.memory=125;
		
		comp2.javaCoding();
		comp2.watchMovie();
		comp2.playGames();
		
		
	}
}
