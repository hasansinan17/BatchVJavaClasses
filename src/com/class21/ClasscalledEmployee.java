package com.class21;

public class ClasscalledEmployee {
//	1. CreateaClasscalledEmployee:
//		● Create three variables eID , salary
//		and set the CEO to “Sumair”
//		● Create two objects of the class
//		Employee
//		● Set the value of eID, salary for each of
//		the objects
//		● Print out the eID , salary and CEO for
//		each of the objects
	int eID=2;
	int salary=500;
	static String CEO="Sumair";
	void printInfo() {
		System.out.println("Employee Id: "+eID+", salary is: "+salary+" CEO is "+CEO);
	}
	
	public static void main(String[] args) {
		ClasscalledEmployee emp1=new ClasscalledEmployee();
		emp1.printInfo();
		ClasscalledEmployee emp2=new ClasscalledEmployee();
		emp2.printInfo();
		
		
		
	}

	

}
