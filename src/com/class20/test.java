package com.class20;

public class test {
	public static void main(String[] args) {
		String str="hello";
			String reversed="";
			for(int i=str.length();i<=0;i--) {
				reversed=reversed+str.charAt(i);
				System.out.println(reversed);
			}
			
	}

}
