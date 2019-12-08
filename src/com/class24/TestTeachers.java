package com.class24;

public class TestTeachers {
	public static void main(String[] args) {
		MathTeacher obj1=new MathTeacher();
		System.out.println(obj1.eyes+" eyes and "+obj1.ears+" ears");
		obj1.teach();
		obj1.teach1();
		
		PianoTeacher obj2=new PianoTeacher();
		System.out.println(obj2.eyes+" eyes and "+obj2.ears+" ears");
		obj2.teach();
		obj2.teach3();
		
		Teacher obj3=new Teacher();
		System.out.println(obj3.eyes+" eyes and "+obj3.ears+" ears");
		obj1.teach();
		obj1.teach1();
		
		ChemistryTeacher obj4=new ChemistryTeacher();
		System.out.println(obj4.eyes+" eyes and "+obj4.ears+" ears");
		obj4.teach();
		obj4.teach2();
	}
	

}
