package com.class21;

public class School {
	public static void main(String[] args) {
		Student student1=new Student();
		//assigning instant variables 
		student1.studentName="Eric";
		student1.GPA=3.95;
		student1.school="Syntax";
		
		
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax";
		
		int hours=3;
		student1.displayInfo();
		student2.displayInfo();
		
		student1.study(3);
		student1.displayInfo();
		
	}

}
