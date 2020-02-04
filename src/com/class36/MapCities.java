package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCities {
	public static void main(String[] args) {
		/*Create a Map from array of cities that will sort keys in alphabetical order. 
		 * As a key store the name of the city and as a value store the length of the city 
		 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 

Create a Map that will store Employee name and salary. 
Write a logic to retrieve an employee who gets the highest salary. 
Output should be in the below format
John Smith=$100000
		 * 
		 */
		Map<String,Integer>citiMap=new TreeMap<>();
		citiMap.put("Ankara",6 );
		citiMap.put("Berlin", 6);
		citiMap.put("Tiran",5 );
		citiMap.put("Sofia",5 );
		citiMap.put("Milan",5 );
		citiMap.put("Washington DC",13);
		
		Set<Entry<String,Integer>>entr=citiMap.entrySet();
		Iterator<Entry<String,Integer>>valIt=entr.iterator();
		while(valIt.hasNext()) {
			int num=
			
				
				
		
				
				
				
				
			}
			System.out.println(str+":"+citiMap.get(str));
			
		
		
			}
		
		
		
		
		
		 
		
	}

}
