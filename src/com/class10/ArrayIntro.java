package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		int a;
		a=10;
		int a1=10;
		//1 way
		int[] b;//declare an array-->preferred way
		int c[];
		 
		b=new int[4];//initialize
		 //2 way-->all in 1 line(declaration and initilization
		 int[] array=new int[4];
		 array[0]=10;
		 array[1]=20;
		 array[3]=30;
		 array[4]=40;
		 //access value from an array
		 System.out.println(array[2]);
		 //lets create an array that will  store classes
		 
		 String[] classes=new String[4];
		 classes[0]="Java";
		 classes[1]="SDLC";
		 classes[2]="Manuel Testing";
		 classes[3]="GIT";
		 
		 System.out.println("Today we have "+classes[0]+" class");
		 System.out.println("***********************************************************************");
		 
		 int[] nums=new int[3];
		 nums[0]=1;
		 nums[1]=2;
		 nums[2]=3;
		 
		 //how can change 1 to 100
		 nums[0]=100;
		 System.out.println(nums[0]);
		 System.out.println(nums[0]+nums[2]);//100+3
		 System.out.println("***************************************************************************");
		 
		 String[] names=new String[3];
		 names[0]="Diana";
		 names[1]="Seda";
		 names[2]="Jaime";
//		 names[3]="Olga"; during run time we will get an exception
//		 ArrayIndexOutOfBoundsException
		 System.out.println(names[3]);
		 //
		 int[] numbers=new int[4];
		 numbers[1]=100;
		 numbers[3]=200;
		 System.out.println(numbers[2]);
		
	}

}
