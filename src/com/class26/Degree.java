package com.class26;

public class Degree {
	String str;
	public String getDegree() {
		str="I got a degree";
		return str;
	}
	

}
 class Undergraduate extends Degree{
	 public String getDegree() {
		 str="I am an undergraduate";
		 return str;
	 }
	
	
}
 class Postgraduate extends Degree{
	 public String getDegree() {
		 str="I am a Postgraduate";
		 return str;
	 }
 }

