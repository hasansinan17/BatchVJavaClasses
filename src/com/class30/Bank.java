package com.class30;

public interface Bank {
	void haveChecking();
	void haveSavings();

}
interface Trustable{
	void trust();
}
class Finance{
	public static void main(String[] args) {
		
	}
}
class BOA implements Bank,Trustable{

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		System.out.println("BOA has checking account");
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
		System.out.println("BOA has saving account");
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("You can trust BOA with your money");
	}
	
}
class CapitalOne implements Bank,Trustable{

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		System.out.println("You can trust CapitalOne with your money");
	}

	@Override
	public void haveChecking() {
		// TODO Auto-generated method stub
		System.out.println("CapitalOne has checking account");
	}

	@Override
	public void haveSavings() {
		// TODO Auto-generated method stub
		System.out.println("CapitalOne has saving account");
	}
	
}
