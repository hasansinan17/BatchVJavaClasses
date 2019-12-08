package com.class32;

public class WrapperClasses {
	public static void main(String[] args) {
		int num=10;
		//Autoboxin-->converting primitive type into an Object type
		Integer integer=100;
		System.out.println(integer.MIN_VALUE);
		String str=integer.toString();
		System.out.println(str);
		//converting boolean primitive type into Boolean Object type
		
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		//AutoUnboxing--> converting Object type into a primitive type
		
		int num2=new Integer(10);
		System.out.println(num2);
	}

}
