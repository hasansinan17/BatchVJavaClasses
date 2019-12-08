package com.class27;

public class Student {
	public void shouldOnTime() {
		System.out.println("Students should be on time in the class!");
	}
	public void shouldStudyHard() {
		System.out.println("Student should study hard!");
	}
	

}
class SyntaxStudent extends Student{
	public void shouldOnTime() {
		System.out.println("Syntax students should be on time in the class");
	}
	public void onlineStudents() {
		System.out.println("Online students are lucky!");
	}
	
}
class CollegeStudent extends Student{
	public void shouldStudyHard() {
		System.out.println("College students should study extra");
	}
	public void haveCar() {
		System.out.println("College Students should have car to drive to go to campus");
	}
	
}
class SchoolStudent extends Student{
	public void shouldStudyHard() {
		System.out.println("All student should study hard to be expert on a specific field");
	}
	public void respectOthers() {
		System.out.println("All students respect each other");
	}
	
}