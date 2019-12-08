package com.class19;

public class Student {
	char getGrade(int num){
		
		char grade;
		if(num>90&&num<=100) {
			grade='A';
		}else if(num>80&&num<=90) {
			grade='B';
		}else if(num>70&&num<=80) {
			grade='C';
		}else if(num>60&&num<=70) {
			grade='D';
		
	}else {
		grade='F';
	}
		return grade;
	

}
	
	public static void main(String[] args) {
		Student score=new Student();
		char grade=score.getGrade(98);
		System.out.println(grade);
		
	}
	
	
	
}
