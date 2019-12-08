package com.class18;

public class Task1 {
//	package com.class18;
//
//	public class Hello {
//		void sayHello(String name) {
//			System.out.println("Hello "+name);
//			
//		}
//		public static void main(String[]args) {
//			Hello obj=new Hello();
//			obj.sayHello("Asel");
//			obj.sayHello("Weqas");
//			obj.sayHello("Diego");
//			obj.sayHelloDifferentLanguage("USA");
//			obj.sayHelloDifferentLanguage("Russia");
//			obj.sayHelloDifferentLanguage("Turkey");
//			obj.sayHelloDifferentLanguage("ParaGuay");
//			//
//			obj.sayNameAndAge("Jack",45);
//			obj.sayNameAndAge("Olga", 50);
//			//
//			obj.isSnowing(false);
//			
//		}
//		/*create a method that will say hello in different language based
//		 * on the value taht will be passed when user calls a method
//		 * 
//		 */
//		void sayHelloDifferentLanguage(String country) {
//			
//			switch(country.toLowerCase()) {
//			case "usa":
//			System.out.println("Hello");
//			break;
//			case "russia":
//				System.out.println("Privet");
//				break;
//			case "paraguay":
//				System.out.println("Hola");
//				break;
//			case "albania":
//				System.out.println("Pershentedje");
//				break;
//				default:
//					System.out.println("Unknown");
//			}
//		}
//		//method to say name and age
//		void sayNameAndAge(String name,int age) {
//			System.out.println("My name is "+name+" and I am "+age+" years old.");
//		}
//		//create a method that will check it snowing
//		//if snow-->stay at home, otherwise go for a walk
//		void isSnowing(boolean isSnowing) {//method header
//			
//			if(isSnowing) {
//				System.out.println("stay home");
//			}else {
//				System.out.println("Go for a walk");
//			}
//		}
//
//	}
	void largerNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+" is larger");
		}else if(num2>num1) {
			System.out.println(num2+" is larger");
		}else {
			System.out.println("numbers are equal.");
		}
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.largerNumber(4, 5);
		obj.evenAndOdd(4);
		obj.isPolindrome("madam");
	}
	void evenAndOdd(int num3) {
		if(num3%2==0) {
			System.out.println(num3+" even");
		}else {
			System.out.println(num3+" is odd");
		}
	}
	void isPolindrome(String word) {
		String reverse="";
		for(int i=word.length()-1;i>=0; i--) {
			reverse=reverse+word.charAt(i);
		}
		if(word.equals(reverse)) {
			System.out.println("The string is a palindrome");
		}else {
			System.out.println("The string isn't a palindrome");
		}
	}
    

	}



