package com.class29;

public abstract class Task {
	public void edit() {
		System.out.println("implemented1");
		
	}
	public void close() {
		System.out.println("implemented2");
	}
	public abstract void open();
	
	

}
class JavaFile extends Task{

	@Override
	public void open() {
		System.out.println("open for JavaFile");
		
	}
	
}
class WordFile extends Task{

	@Override
	public void open() {
	System.out.println("open for WordFile");
		
	}
	
}
class PDFFile extends Task{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open for PDFFile");
		
	}
	
}

