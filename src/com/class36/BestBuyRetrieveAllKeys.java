package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BestBuyRetrieveAllKeys {
	public static void main(String[] args) {
		/*	Map<String, String> personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and all values?
		Set<String> keys=personMap.keySet();
		
		System.out.println("-----Printing all keys using loop-------------");
		//how can I retrieve and print values key:value using for loop
		for(String key: keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		System.out.println("-----Printing all keys using iterator-------------");
		//how can I retrieve and print values key:value using iterator
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			//System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next()));
			String mapKey=keysIterator.next();
			String mapValue=personMap.get(mapKey);
			
			System.out.println(mapKey+"_"+mapValue);
		 * 
		 */
		
		Map<Integer,String>bestBuyItem=new HashMap<>();
		bestBuyItem.put(123, "LapTop");
		bestBuyItem.put(234, "Video Camera");
		bestBuyItem.put(345, "USB");
		bestBuyItem.put(456, "Smart TV");
		bestBuyItem.put(567, "Printer");
		
		System.out.println(bestBuyItem.get(123));
		Set<Integer>keys=bestBuyItem.keySet();
		System.out.println("*********************** using enhanced for loop to get all keys and call entire data");
		for(Integer key:keys) {
			System.out.println(key+":"+bestBuyItem.get(key));
			
			
		}
		System.out.println("*************using iterator method to get all keys of the object and call all entry");
		Iterator<Integer>keyIt=keys.iterator();
		while(keyIt.hasNext()) {
			int itemNum=keyIt.next();
			String all=itemNum+":"+bestBuyItem.get(itemNum);
			System.out.println(all);
			
		}
		
		
	}

}
