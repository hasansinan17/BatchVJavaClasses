package com.class36;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Person {
	/*Create a Person class with following private fields: name, lastName, age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
 In that map store personId and a Person Object. Print each object details.
	 * 
	 */
	private String name,lastName;
	private int age;
	private double salary;
	Person(String name,String lastName,int age,double salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
		
		
			
		
	}
	public void display() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
	public static void main(String[] args) {
		Map<Integer,Person>task=new TreeMap<>();
		task.put(2, new Person("hasan","kaptan",37,100000));
		task.put(3, new Person("ali","ozkalay",37,120000));
		task.put(1, new Person("suleyman","ozay",39,130000));
		
		Set<Entry<Integer,Person>>entr=task.entrySet();
		for(Entry<Integer,Person>entrs:entr) {
			Person p=entrs.getValue();
			Integer k=entrs.getKey();
			System.out.println(k+"=="+p.name+","+p.lastName+","+p.age+","+p.salary);
			p.display();
		}
		Iterator<Entry<Integer,Person>>entIt=entr.iterator();
		while(entIt.hasNext()) {
			Entry<Integer,Person> e=entIt.next();
			int k=e.getKey();
			Person p=e.getValue();
			System.out.println(k+"-"+p.name+"-"+p.lastName);
			p.display();
			
		}
		
		
	}

}
