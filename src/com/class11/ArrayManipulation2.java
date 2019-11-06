package com.class11;

import java.util.Arrays;

public class ArrayManipulation2 {
	public static void main(String[] args) {
//		String[] actualNames= {"John","Smith","Alex","Tanaz"};
//		String[] expectedNames= {"Smith","John","Alex","Tanaz"};
//		String actual=Arrays.toString(actualNames);
//		String expected=Arrays.toString(expectedNames);
//		System.out.println(actual.equals(expected));
		
//		String firstName="Zom";
//		String firstName2="Ali";
//		String firstName3="Zom";
//		String firstName4="Ali";
//		
//		String actl=firstName+firstName2;
//		String expt=firstName3+firstName4;
//		System.out.println(actl);
//		System.out.println(expt);
		
		int[] nums= {123,34,15,66,99};
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.print(i+" ");
		}
		
	}

}
