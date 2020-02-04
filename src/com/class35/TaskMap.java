
package com.class35;

import java.util.HashMap;
import java.util.Map;

public class TaskMap {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "HomeDepot");
		map.put(4, "Apple");
		map.put(5, "Lenova");
		map.put(6, "UPS");
		map.put(7, "Toshiba");
		
		int num=map.size();
		System.out.println(num);
		map.replace(4, "Amazon");
		map.remove(7);
		System.out.println(map);
		
	}

}
