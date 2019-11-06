package com.class14;

public class SplitMethod {
	public static void main(String[] args) {
		/*.split()
		 * 
		 */
		//This method splits this string around mathches of the given regular expression.
//		String str="Video provides a powerful way to help you prove your point.";
//		String[] array=str.split(" ");
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//		//How can we find how many sentences are in the following string;
//		System.out.println("*****************");
		String str1="Today is Sunday. Its sunny day. and we are haveing java class";
		
		String[]array2=str1.split(".");
		for (String string:array2) {
			System.out.println(string);
		}
	}

}
