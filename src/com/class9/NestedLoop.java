package com.class9;

public class NestedLoop {
	public static void main(String[] args) {
//		for(int i=1; i<=3; i++){
//			System.out.println("I am outer loop");
//			for(int j=1; j<=3; j++){
//			System.out.println("I am inner loop");
//			}
//		}
		
//		for(int i=0; i<=5; i++) {
//			System.out.println(i);
//			for(int j=0; j<=5; j++) {
//				System.out.println(i+" "+j);
//			}
//		}
		
//		for(int h=0; h<24; h++) {
//			
//			for(int m=0; m<60; m++) {
//				
//				System.out.println(h+":"+m);
//			}
//			
//		}
//for(int h=0; h<24; h++) {
//			
//			for(int m=0; m<60; m++) {
//				if(m<=9) {
//					System.out.println(h+":"+"0"+m);
//				}else {
//					System.out.println(h+":"+m);
//					
//				}
//				
//				
//			}
//			
//		}
		for(int i=0;i<=9;i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					for(int l=0; l<=9; l++) {
						System.out.println(i+""+j+""+""+k+""+l);
					}
				}
			}
			
		}
	}

}
