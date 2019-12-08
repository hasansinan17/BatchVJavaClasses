package com.class24;

public class ThisKeyword {
	int a,b;
	public ThisKeyword(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void sum(int a,int b) {
		System.out.println("The sum of local parameters is "+(a+b));
		System.out.println("The sum of Instance variables is "+(this.a+this.b));
		
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(5,10);
		obj.sum(10,20);
	}

}
