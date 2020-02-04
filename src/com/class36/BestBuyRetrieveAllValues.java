package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BestBuyRetrieveAllValues {
	/*Map<String, String> personMap = new HashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");

		System.out.println(personMap);
		System.out.println("-----Printing all values-------------");
		Collection<String> values = personMap.values();

		for (String val : values) {
			System.out.println(val);
		}

		Iterator<String> valuesIterator = values.iterator();
		while (valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
	 * 
	 */
	public static void main(String[] args) {
		Map<Integer,String>bestBuyItem=new HashMap<>();
		bestBuyItem.put(123, "LapTop");
		bestBuyItem.put(234, "Video Camera");
		bestBuyItem.put(345, "USB");
		bestBuyItem.put(456, "Smart TV");
		bestBuyItem.put(567, "Printer");
		
		Collection<String>value=bestBuyItem.values();
		System.out.println(value);
		System.out.println("*********************using each loop to get all values");
		for(String val:value) {
			System.out.println(val);
			
			
		}
		System.out.println("*************using iterator to get all values");
		Iterator<String>valIt=value.iterator();
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		
	}

}
