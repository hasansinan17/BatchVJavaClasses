package com.class34;

public abstract class Card {
	/*Create a Card class that will have implemented and unimplemented methods and a constructor that  will  initializes  
	 * credit  card  type.    
	 * Create  3 subclasses  of  a  Card  card.  
	 * Create  3  objects  of different  card  and  store  them  into  LinkedList. 
	 * Using  for  loop/advanced  for  loop/  iterator access all methods of the class.
	 * 
	 */
	String cardType;
	public Card(String cardType) {
		this.cardType=cardType;
	}
	public void makePayment() {
		System.out.println("You can make payment with your "+cardType);
	}
	public abstract void interest();
	public abstract void statementDue();
	

}
class Discover extends Card{
	Discover(String cardType){
		super(cardType);
		
	}

	@Override
	public void interest() {
		System.out.println("Discover "+cardType+" 0% APR for 12 months for first 12 months cycle.");
		
	}

	@Override
	public void statementDue() {
		System.out.println("Discover "+cardType+" statement due date depends on your preference. ");
		
	}
	
}
class AmericanEx extends Card{
	AmericanEx(String cardType){
		super(cardType);
	}

	@Override
	public void interest() {
		System.out.println("American Express "+cardType+" is the worst credit card never give 0% APR options.");
		
	}

	@Override
	public void statementDue() {
		System.out.println("American Express "+cardType+" statement due date is usually 2nd day of the month.");
		
	}
	
}
class CapitalOne extends Card{
	CapitalOne(String cardType){
		super(cardType);
	}

	@Override
	public void interest() {
		System.out.println("CapitalOne "+cardType+" 0% APR for 18 months for first 18 months cycle");
		
	}

	@Override
	public void statementDue() {
		System.out.println("CapitalOne "+cardType+" statement due date is usually 12nd day of the month.");
		
	}
	
}
