package com.class22;

public class TestStaticvsNonStatic {
	/*how to access static members
	 * they can be accessed by className
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
	}

}
