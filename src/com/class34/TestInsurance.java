package com.class34;
import java.util.*;
public class TestInsurance {
	public static void main(String[]args) {
		ArrayList<Insurance>ins=new ArrayList<>();
		Insurance car=new Car();
		car.insuranceName="Geico";
		ins.add(car);
		
		
		
		Insurance pet=new Pet();
		pet.insuranceName="Geico";
		ins.add(pet);

		Insurance per=new Health();
		per.insuranceName="Geico";
		ins.add(per);
	
		
		System.out.println(ins.size());
		System.out.println("*************************************loop advanced method***********************************");
		for(Insurance str1:ins) {
			str1.getQuote();
			str1.cancelInsurance();
			
			
		}
		System.out.println("********************************for loop method******************************************");
		for(int i=0;i<ins.size();i++) {
			ins.get(i).getQuote();
			ins.get(i).cancelInsurance();
			
		}
		System.out.println("************************************iterator method*******************************************");
		Iterator<Insurance>it=ins.iterator();
		while(it.hasNext()) {
			Insurance obj=it.next();
			obj.getQuote();
			obj.cancelInsurance();
		}
		
		
		
		
	}

}
