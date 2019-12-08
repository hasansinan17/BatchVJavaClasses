package com.class23;

public class BookClass {
	String name;
	int age;
	BookClass(String name1,int age1){
		name=name1;
		age=age1;
		System.out.println("My Name is "+name+" and I am "+age+" years old.");
	}
	BookClass(){
		System.out.println("This is end of first part of today's hw. It is time to exercise!!!");
		
	}
	public static void main(String[] args) {
		BookClass obj=new BookClass("Hasan",37);
		BookClass obj2=new BookClass();
	}

}
