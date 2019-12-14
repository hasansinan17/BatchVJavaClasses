package com.class34;

public abstract class Insurance {
	/*Create  a  class  Insurance  that  will  have  an attribute as insuranceName and 
	 * unimplemented behaviour  as  getQuote  and  cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and 
	 * Class Pet has petType  attribute.  Create  3  objects  of  the  sub classes  and  store  them  in  ArrayList.  
	 * Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
	 * 
	 */
	String insuranceName;
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	String carModel="PriusV";

	@Override
	public void getQuote() {
		
		System.out.println(insuranceName+" quote is $45 for your "+carModel);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your "+insuranceName+" car insurance for free whenever you want for your "+carModel);
		
	}
	
}
class Pet extends Insurance{
	String petType="Dog";

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" quote is $20 for your "+petType);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your "+insuranceName+"  insurance for  your pet for free whenever you want for your "+petType);
		
	}
	
}
class Health extends Insurance{

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" quote is $50 for your health insurance");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your isurance anytime for free");
		
	}
	
}
