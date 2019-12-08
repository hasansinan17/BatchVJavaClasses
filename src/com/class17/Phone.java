package com.class17;

public class Phone {
	//define attributes/features
//	String make,model,color;
//	int year,wheels,windows,speed;
//	//adding behavior/action-->methods();
//	void drive() {
//		System.out.println("Car "+make+" can drive");
//	}
//	void start() {
//		System.out.println("Car "+make+" can start");
//	}
//	void accelerate() {
//		System.out.println("Car "+make+" can accelerate");
//	}
	String make,model,color;
	int screen;
	void call(){
		System.out.println("You can call with "+model);
		
	}
	void search() {
		System.out.println("You can search with "+model);
	}
	void playGame() {
		System.out.println("You can play games with "+model);
	}
	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.make="Apple";
		iPhone.model="IphoneX";
		iPhone.color="Silver";
		iPhone.call();
		iPhone.playGame();
		iPhone.search();
		System.out.println("************");
		Phone Android=new Phone();
		Android.make="Samsung";
		Android.model="Note 5";
		Android.color="Red";
		Android.call();
		Android.search();
		Android.playGame();
		System.out.println("****************");
		Phone Nokia=new Phone();
		Nokia.make="Nokia";
		Nokia.model="5110";
		Nokia.color="Grey";
		Nokia.call();
		Nokia.search();
		Nokia.playGame();
		
		
				
		
	}

}
