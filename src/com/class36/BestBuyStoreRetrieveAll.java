package com.class36;

import java.util.*;
import java.util.Map.Entry;


public class BestBuyStoreRetrieveAll {
	/*1.Create a map of Best Buy store. Placeitem id and item name into it. 
	 * Example (7664847 = Printer, 7879885= TV etc )
	 * ●Retrieve all keys and values from a Best Buy map using EntrySet.
	 *
		Map<String, Integer> classRoom=new HashMap<>();
		
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		
		System.out.println(classRoom);
		
		Set<Entry<String, Integer>> entrySet=classRoom.entrySet();
		
		System.out.println("---------using for each loop to get all entry objects");
		
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("---------using iterator to get all entry objects");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+"----"+ent.getValue();
			System.out.println(entry);
	 * 
	 */
	public static void main(String[] args) {
		Map<Integer,String>bestBuyItem=new HashMap<>();
		bestBuyItem.put(123, "LapTop");
		bestBuyItem.put(234, "Video Camera");
		bestBuyItem.put(345, "USB");
		bestBuyItem.put(456, "Smart TV");
		bestBuyItem.put(567, "Printer");
		
		Set<Entry<Integer,String>>entryBestBuy=bestBuyItem.entrySet();
		System.out.println("***********************using each for loop to get all entry objects");
		for(Entry<Integer,String>entry:entryBestBuy) {
			System.out.println(entry.getKey()+":"+entry.getValue());
//			int itemID=entry.getKey();
//			String itemName=entry.getValue();
//			System.out.println(itemID+":"+itemName);
			
		}
		System.out.println("**************************using iterator to get all entry objects");
		Iterator <Entry<Integer,String>>entryIt=entryBestBuy.iterator();
		while(entryIt.hasNext()) {
			Entry<Integer,String>ent=entryIt.next();
//			String item=ent.getKey()+":"+ent.getValue();
//			System.out.println(item);
			System.out.println(ent.getKey()+":"+ent.getValue());
//			System.out.println(entryIt.next().getKey()+":"+entryIt.next().getValue());
			
			
			
		}
		
		
		
	}

}
