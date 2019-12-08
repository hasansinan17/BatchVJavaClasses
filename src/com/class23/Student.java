package com.class23;

public class Student {
	String name;
	int grade1,grade2,grade3;
	Student(String studentName,int gr1,int gr2,int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	public static void main(String[] args) {
		Student student1=new Student("John",90,78,100);
		student1.calculateAverage();
		Student student2=new Student("Ali",98,80,100);
		student2.calculateAverage();
		Student student3=new Student("Jane",100,80,98);
		student3.calculateAverage();
		Student student4=new Student("Suleyman",67,89,100);
		student4.calculateAverage();
		Student student5=new Student("Jack",100,78,86);
		student5.calculateAverage();
	}
	public void calculateAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println(name+"'s average grade is "+average);
	}

}
