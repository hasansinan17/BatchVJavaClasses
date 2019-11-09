package com.class16;

public class IQ3 {
	public static void main(String[] args) {
//#3
		
//String str="Hello 6877688 *&^^, welcomegyggiqgig!!!!";
//str=str.replaceAll("[^a-zA-Z]", "");
//System.out.println(str.length());

/* * 4.How to find out the part of the string from a string?
		 * What is substring?
		 * Find number of words in string?
 * 
 */

//	String str="Today is very cold outside";
//	String subString=str.substring(0,5);
//	System.out.println(subString);
//	/*Step1
//	 * 
//	 */
//	System.out.println(str);
//	String[] words=str.split(" ");
//	System.out.println(words.length);
		
		
		//5.Write a java program to reverse String? Reverse a string word by word?
		String given="Welcome to the Java class";
		/*to rerverse String
		 * split();
		 * Step1:split-->array of String
		 * Step2: use for loop and use decrement to print values
		 * 
		 */
		String reversed="";
		String[] str=given.split("\\s");
		for(int j=str.length-1; j>=0; j--) {
			reversed=reversed+str[j]+" ";
		}
		System.out.println(reversed);
		//Write a java program to reverse String?
		//toCharArray;charAt();
		String given1="Today is Java Class";
		char[] charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>=0; i-- ) {
			System.out.print(charArray[i]);
		}
		//Using charAt();
		System.out.println();
		String word3="I love Java";
		for(int i=word3.length()-1; i>=0; i--) {
			System.out.print(word3.charAt(i));
		}
		//6.Write a Java Program to find whether a String is palindrome or not?
		//if reversed string and original string are same-->string is palindrome
		//examples; mom,dad,madam,racecar
		
		/*Logic:
		 * Step1: reverse the string
		 * Step 2: compare 2 Strings:
		 * 
		 */
		String original="kayak";
		String reversed1="";
		for(int i=original.length()-1; i>=0; i--) {
			reversed1=reversed1+original.charAt(i);//""+k=k+a=ka+k
		}
		System.out.println(reversed1);
		if(original.equals(reversed1)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
	}

}
