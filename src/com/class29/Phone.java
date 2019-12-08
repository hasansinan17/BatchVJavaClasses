package com.class29;

public abstract class Phone {
	//implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}
	public void sendText() {
		System.out.println("Send Text");
	}
	//unimplemented methods
	public abstract void takePictures();
	public abstract void playGames();
		
	

}
class iPhone extends Phone{
	
	public void takePictures() {
		
	}

	@Override
	public void playGames() {
		// TODO Auto-generated method stub
		
	}
	
}
