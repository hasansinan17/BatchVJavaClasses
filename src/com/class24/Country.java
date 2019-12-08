package com.class24;

public class Country {
	
	public String capital,name;
	
	Country(){
		System.out.println("I am non-argument constructor.");
	}
	Country(String countryName,String countryCapital){
		name=countryName;
		capital=countryCapital;
		
		
	}
	
	public static void main(String[] args) {
		
	
//	Country country1=new Country();
//	country1.name="usa";
//	country1.capital="washington dc";
//	Country country2=new Country();
//	country2.name="turkey";
//	country2.capital="ankara";
		
		Country obj1=new Country("USA","Washington DC");
		Country obj2=new Country("Turkey","Ankara");
		Country obj3=new Country("Germany","Barlin ");
		obj1.displayInfo();
		System.out.println(obj2.name+" "+obj2.capital);
		
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
}
