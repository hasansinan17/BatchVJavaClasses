package com.class35;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCountries {
	public static void main(String[] args) {
		Map<String,String>mapCapitals=new TreeMap<>();
		
		mapCapitals.put("USA","Washington DC");
		mapCapitals.put("Russia","Moscow");
		mapCapitals.put("Greece","Athens");
		mapCapitals.put("France","Paris");
		mapCapitals.put("Germany","Berlin");
		
		Set<String>keys=mapCapitals.keySet();
		for(String key:keys) {
			System.out.println(key+": "+mapCapitals.get(key));
		}
		
		Iterator<String>iteratorKey=keys.iterator();
		while(iteratorKey.hasNext()) {
			String cap=mapCapitals.get(iteratorKey);
			System.out.println(iteratorKey.next()+": "+mapCapitals.get(iteratorKey.next()));
			
		}
		for(String values:)
		
		
	}

}
