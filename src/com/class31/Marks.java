package com.class31;

public abstract class Marks {
	public abstract void getPercentage();
		
	

}
class StudentA extends Marks {
	double avrScore;
	StudentA(double subject1,double subject2,double subject3){
		 avrScore=(subject1+subject2+subject3)/3;
		
	}

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		System.out.println(avrScore);
		
		
	}

}
 class StudentB extends Marks{
	  double avrScore;
	 StudentB(double subject1,double subject2,double subject3,double subject4){
		  avrScore=(subject1+subject2+subject3+subject4)/4;
		 
	 }

	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		System.out.println(avrScore);
		
	}
	
}
