package com.class25;

public class Test {
	public static void main(String[] args) {
		System.out.println("Creating a object of Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of a Scrum Team class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog,Sprint Backlog";
		sm.ceremonies="Sprint Demo,Planing,Retro,Daily Sprint StandUp";
		sm.attendScrumMeetings();
		
	}

}
