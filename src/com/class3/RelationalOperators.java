package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=20;
int num2=19;
System.out.println(num1>num2);
System.out.println(num1<num2);
System.out.println("***************");

double d=1.99;
double d1=2.99;
boolean b=d>d1;
System.out.println(b);

boolean b1=d<d1;
boolean b2=d==d1;
boolean b3=d!=d1;
 System.out.println(b1);
 System.out.println(b2);
 System.out.println(b3);
 
 int a=90;
 int b6=30;
 //if number a is bigger than number b
 //i want to print a is larger than b
 
 if (a>b6) {
	 System.out.println("a is larger than b6");
 }else {System.out.println("a is smaller than b6");
		

	}

 int expectedHours=15;
 int actualHours=2;
 //if expected hours are more than actual --> you will succeed
 //otherwise, please study more
 
 if(actualHours>expectedHours) {
	 System.out.println("you will succed");
 }else {
	 System.out.println("please study more");
 }
 
 double teaPrice=4.99;
 double allowedPrice=3.99;
 // if price is more than i can afford i will not buy
 //if price is less or matches what can i afford then i will buy tea
 
 if(allowedPrice>=teaPrice) {
	 System.out.println("I will buy tea");
	 
 } else {System.out.println("I cannot afford, I need to study more");
		 
}
}
}
