package com.class37;
import java.util.*;
public class ReturnMethodObject {
public static void main(String[] args) {
	List<String>list=returnStringList("Java","My favarite subject");
	System.out.println(list);
	Map<String,String>map=returnMap("1","GS","2","FB");
	System.out.println(map);
}
//create a method that will return an object of Scanner class
public static Scanner returnScanner() {
	Scanner scan=new Scanner(System.in);
	return scan;
	
}
//create a method that will return an Object of List Class
public static List<String>returnStringList(String str1,String str2){
	List<String>list=new ArrayList<>();
	list.add(str1);
	list.add(str2);
	return list;
}
//create a method that will return an Object of Class
public static Map<String,String>returnMap(String key1,String value1,String key2,String value2){
	Map<String,String>map=new HashMap<>();
	map.put(key1, value1);
	map.put(key2,value2);
	return map;
}
}
