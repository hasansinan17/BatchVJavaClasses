package com.class10;

public class TaskArrays {
	public static void main(String[] args) {
		char[] grades= {'A','B','C','D','E','F'

		};
	System.out.println(grades[2]);
	for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	}
	System.out.println("*******************************************************************************");	
//		String[] myStringArray= {"Ali","Suleyman","Hasan","Jessica","Genesis","Aylin"};
//		
//		System.out.println(myStringArray[1]);
	
//	int[] myIntArray= {1,2,3,4,5};
//	System.out.println(myIntArray[0]+myIntArray[1]+myIntArray[2]+myIntArray[3]+myIntArray[4]);
	
	
//	int[] nums= {1,2,3};
//	System.out.println(nums[1]);
	
//	String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
//	int size=animals.length;
//	for(int i=0; i<size; i++) {
//		System.out.print(animals[i]+" ");
//	}
	//create an array to store 5 double values, print all in 1 line
//	
String[] animals= {"Cat","Cow","Dog","Snake","Elephant"};
for(int i=0; i<animals.length; i++) {
	if(animals[i].equals("Dog")) {
		System.out.println("I love Dogs");
	}else {
		System.out.println(animals[i]);
	}
}
		
	}

}
