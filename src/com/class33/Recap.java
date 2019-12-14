package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(100);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		System.out.println(size);
		
		//add more
		numbers.add(1000000);
		//remove
		numbers.remove(size-1);//index 3
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrive value from an arraylist
		int element=numbers.get(0);
		System.out.println(element);
		//1.for loop
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		//2. advanced loop
		for(int num:numbers) {
			System.out.println(num);
		}
		System.out.println("***********************");
		
		//i want to get values backward
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.println(numbers.get(i));
		}
		
		// using Iterator
		Iterator<Integer>iterator=numbers.iterator();
		
	}

}
