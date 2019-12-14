package com.class33;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	int studentId;
	public Student(String name,int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	public void display() {
		System.out.println();
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		List<Student>students=new ArrayList<>();
		Student stu=new Student("John",101);
		Student stu1=new Student("Jane",102);
		Student stu2=new Student("Jack",103);
		//display info of each student
		stu.display();
		stu1.display();
		
		
	}

}
