package com.class35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Recap {
	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String>str=new LinkedHashSet<>(aList);
		System.out.println(str);
		Iterator<String>it=str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

}
	}

