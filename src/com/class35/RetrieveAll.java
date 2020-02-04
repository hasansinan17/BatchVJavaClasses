package com.class35;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {
	public static void main(String[] args) {
		Map<String,String>personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		String value=personMap.get("State");
		System.out.println(value);
		
		System.out.println("*********************");
		
		Set<String>keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		Iterator<String>keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			
			System.out.println(keysIterator.next()+":"+personMap.get(keysIterator.next()));
			
		}
		
		
		
		
		
	}

}
