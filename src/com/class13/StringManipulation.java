package com.class13;

public class StringManipulation {
	public static void main(String[] args) {
		String str="Java is getting interesting";
		System.out.println(str.substring(15));
		System.out.println(str.substring(8,15));
		System.out.println("********************");
		String day="Sunday";
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();
		System.out.println("//////////////////////////");
		String str5="Hello";
		int middle=str5.length()/2;
		if(!str5.isEmpty()) {
			if(str5.length()%2!=0&&str5.length()>=3) {
				System.out.println(str5.charAt(middle));
				
				
			}
			
		}
		
	}

}
