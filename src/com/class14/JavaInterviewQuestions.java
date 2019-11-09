package com.class14;

import java.util.Arrays;
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
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num=scan.nextInt();
//		
//		
//        boolean b = false;
//        for(int i = 2; i <= num/2; ++i)
//        {
//            // condition for non-prime number
//            if(num % i == 0)
//            {
//                b = true;
//                break;
//            }
//        }
//        if (!b)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");
        
//        #1
//        int a=10; int b=20;
//        a=a+b;//30
//        b=a-b;//30-20=10
//        a=a-b;//30-10=20
//        System.out.println("the value of a="+a);
//        System.out.println("the value of b="+b);
//        
//        String str1="Hello";
//        String str2="Bye";
//        str1=str1+str2;//HelloBye
//        str2=str1.substring(0,5);//Hello
//        str1=str1.substring(5);
//        System.out.println("The value of str1="+str1);
//        System.out.println("The value of str2="+str2);

        //        #2
		int[] array= {100,-90,8787,898,0,1,-90,8787};
//		1 easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
//		2. way
		int[] myArray= {100,-90,8787,898,0,1,-90,8787};
		int largest=myArray[0];
		int smallest=myArray[0];
		for(int i=0; i<myArray.length;i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}
			if(myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
        System.out.println("The smallest value in the array "+smallest);
        System.out.println("The largest value in the array "+largest);
        
//        
        int[] nums= {100,-90,8787,898,0,1,-90,8787};
        int large=nums[0];
        int secondLarge=nums[0];
        for(int i=0; i<nums.length;i++) {
        	if(nums[i]>large) {
        		secondLarge=large;
        		large=nums[i];
        	}
        	else if(nums[i]>secondLarge&&nums[i]<large) {
        		secondLarge=nums[i];
        	}
        }
        System.out.println(secondLarge);
    }

		
	

}
