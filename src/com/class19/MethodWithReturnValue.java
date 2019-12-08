package com.class19;

public class MethodWithReturnValue {
	public static void main(String[] args) {
		/*declare a String and
		 * if String is more than 10 characters -->String is large
		 * otherwise-->String is small
		 * 
		 */
		String str="Welcome home";
		int numOfChars=str.length();
		if(numOfChars>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		char character=str.charAt(4);
		System.out.println(character);
		//create an object of the class where method is defined
		Recap obj=new Recap();
		obj.sum(10, 20);
		MethodWithReturnValue obj1=new MethodWithReturnValue();
		int sum=obj1.sum(50, 50);
		System.out.println(sum);
		int large=obj1.findLargest(20, 40);
		System.out.println(large);
		
		String k="Fello";
		char h=k.charAt(1);
		System.out.println(h);
		String s="Galatasaray";
		String j=s.substring(0, 7);
		System.out.println(j);
		
		
	}
	//return type, method name (list of parameters)
	int sum(int num1,int num2) {
		int c=num1+num2;
		return c;
	}
	int findLargest(int num1,int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest;
	}

}
