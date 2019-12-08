package com.class20;

public class Task {
	/*1)Create a method that will take 1 parameter as a String and return reversed String.
	 *  Method should be visibly only within same package.
	2)Create a method that will take a String and return whether String is palindrome or not. 
	Method should be available to all classes within your projects.
	3)Create a method that will take a string and return an array of words from that string. 
     Method should be available only within same class.
	 * 
	 */
	//1)
	public static void main(String[] args) {
		Task task=new Task();
		String result1=task.reverseString("Syntax");
		System.out.println(result1);
		String[] strArray=task.arrayOfString("What a beautiful day is today!");
		System.out.println(strArray);
		
		
	}
	String reverseString(String param) {
		String result="";
		char[] charArray=param.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			result+=charArray;
		}
		return result;
		
		
	}
	//3)
	String[] arrayOfString(String sentence) {
		
		//String[] stringArray=sentence.split(" ");
		//return stringArray;
		return sentence.split(" ");
	}

}
