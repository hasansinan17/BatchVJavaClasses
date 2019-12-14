
package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class TestCard {
	public static void main(String[] args) {
		LinkedList<Card>cards=new LinkedList<>();
		Card card1=new Discover("Mastercard");
		cards.add(card1);
		cards.add(new AmericanEx("Amex"));
		cards.add(new CapitalOne("Visa"));
		System.out.println(cards.size());
		
		System.out.println("*******************************advanced loop method***********************");
		
		for(Card str:cards) {
			str.interest();
			str.statementDue();
			str.makePayment();
		}
		System.out.println("***********************************for loop method***************************");
		for(int i=0; i<cards.size();i++) {
			cards.get(i).interest();
			cards.get(i).statementDue();
			cards.get(i).makePayment();
		}
		System.out.println("********************************Iterator method*********************************");
		Iterator<Card>it=cards.iterator();
		while(it.hasNext()) {
			Card obj=it.next();
			obj.interest();
			obj.statementDue();
			obj.makePayment();
		}
		
		
		
	}

}
