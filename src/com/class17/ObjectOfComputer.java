package com.class17;

public class ObjectOfComputer {
	public static void main(String[] args) {
		Computer computer1=new Computer();
		computer1.name="Lenova";
		computer1.brand="ideapad330S";
		computer1.keyboard=true;
		computer1.monitor=true;
		computer1.mouse=true;
		computer1.screen=15;
		computer1.ram=20;
		computer1.memory=500;
		
		System.out.println(computer1.ram);
	}

}
