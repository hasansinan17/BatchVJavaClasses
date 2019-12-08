package com.class27;

import java.util.Scanner;

public class CardTest {
	public static void main(String[] args) {
		//primitive
		int i=10;
		//non primitive
		String str="Heello";
		Scanner scan;
		MC mc;
		//take an object of the child class and give reference to the parent
		//           referenca variable= object is created
		
		Card card=new AX();
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new Visa();
		card2.creditLimit();
		
		// type [] arrayName={};
		//type [] arrayName=new type[];
		int[] numArray= {10,12,13};
		String[] stringArray= {"aa","bb"};
		// creating an object and storing it directly into an Array of Cards
		Card[] cardArray= {card,card1,card2};
		Card[] cardArray1= {new MC(),new AX(),new Visa(),new Discovery()};
		System.out.println("---------------------------------------------------------");
		//cardArray[0]->MC
		//cardArray[3]->Discovery
		
		for (Card myCard:cardArray1) {
			myCard.creditLimit();
			myCard.chargeInterest();
		}
		
		
		
		
		
	}
	

}
