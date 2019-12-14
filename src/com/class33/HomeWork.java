package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {
	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Dodge");
		cars.add("Chevy");
		
		for(String str:cars) {
			System.out.println(str);
		}
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		Iterator<String>it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
