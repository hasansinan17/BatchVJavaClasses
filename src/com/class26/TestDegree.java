package com.class26;

public class TestDegree {
	public static void main(String[] args) {
		Degree obj1=new Degree();
		String str=obj1.getDegree();
		System.out.println(str);
		
		Undergraduate obj2=new Undergraduate();
		String str1=obj2.getDegree();
		System.out.println(str1);
		
		Postgraduate obj3=new Postgraduate();
		String str2=obj3.getDegree();
		System.out.println(str2);
		
		
	}

}
