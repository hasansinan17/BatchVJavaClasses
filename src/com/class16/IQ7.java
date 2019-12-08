package com.class16;

public class IQ7 {
public static void main(String[] args) {
	//#7
	int num=5;
	boolean isPrime=true;
	for(int i=2; i<=num; i++) {
		if(num%i==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println(num+" is a prime number");
	}else {
		System.out.println(num+" is not a prime number");
	}
}

}
