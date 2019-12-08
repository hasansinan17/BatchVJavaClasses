package com.class23;

public class Student1 {
	String name;
	String address;
	Student1(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Address of "+this.name+" is "+this.address);
	}
	public static void main(String[] args) {
		Student1 obj=new Student1("Hasan","2301 Collingwood ln GA 30022");
		obj.displayInfo();
	}

}
