package com.class21;

public class TaskStudents {
//	2. Create a Class called Students
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students
	
	public String studentName;
	public int studentId;
	public static int numberOfStudents;
	public static void main(String[] args) {
		TaskStudents stu1=new TaskStudents();
		stu1.studentName="Ali";
		stu1.studentId=345;
		stu1.numberOfStudents++;
		TaskStudents stu2=new TaskStudents();
		stu2.studentName="Veli";
		stu2.studentId=385;
		stu2.numberOfStudents++;
		TaskStudents stu3=new TaskStudents();
		stu3.studentName="Jane";
		stu3.studentId=545;
		stu3.numberOfStudents++;
//		System.out.println("The number of students "+stu1.numberOfStudents);
//		System.out.println("The number of students "+stu2.numberOfStudents);
//		System.out.println("The number of students "+stu3.numberOfStudents);
		System.out.println("The number of students "+TaskStudents.numberOfStudents);
	}

}
