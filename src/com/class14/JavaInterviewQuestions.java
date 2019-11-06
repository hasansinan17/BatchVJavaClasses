package com.class14;

import java.util.Scanner;

public class JavaInterviewQuestions {
	public static void main(String[] args) {
		/*1.Write a program to swap 2 numbers without 
		 * a temporary variable? Swap 2 strings without a temporary variable?
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 * 3.Find out how many alpha characters present in a string?
		 * 4.How to find out the part of the string from a string?
		 * What is substring?Find number of words in string?
		 * 5.Write a java program to reverse String? Reverse a string word by word?
		 * 6.Write a Java Program to find whether a String is palindrome or not?
		 * 7.Write a java program to check whether a given number is prime or not?
		 * 8.Write a Java Program to print first 10 numbers of Fibonacci series.
		 * 
		 */
		
		//7)
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		
		
        boolean b = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for non-prime number
            if(num % i == 0)
            {
                b = true;
                break;
            }
        }
        if (!b)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

		
	

}
