package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		String[] actualNames= {"John","Smith","Alex","Tanaz"};
		String[] expectedNames= {"Smith","John","Alex","Tanaz"};
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		System.out.println(actual.equals(expected));
	}

}
