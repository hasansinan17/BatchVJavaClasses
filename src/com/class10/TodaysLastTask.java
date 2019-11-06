package com.class10;

public class TodaysLastTask {

	public static void main(String[] args) {
		/*Create an array of countries
		 * while retrieving all values from an array
		 * print capital for each country
		 * 
		 */
//		String[] countries= {"USA","Russia","Turkey","Afghanistan","Colombia"};
//		for(int i=0; i<countries.length; i++) {
//			if(countries[i].equals("USA")) {
//				System.out.println("Washington DC");
//			}else if(countries[i].equals("Russia")) {
//				System.out.println("Moscow");
//			}else if(countries[i].equals("Turkey")) {
//				System.out.println("Ankara");
//			}else if(countries[i].equals("Afghanistan")) {
//				System.out.println("Kabul");
//			}else if(countries[i].equals("Colombia")) {
//				System.out.println("Bogota");
//			}
//		}
//		
		String[] countries= {"Afghanistan","Colombia","USA","Russia","Turkey"};
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case "Afghanistan":
			System.out.println("Kabul");
			break;
			case "Colombia":
				System.out.println("Bogota");
				break;
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Russia":
				System.out.println("Moskow");
				break;
			case "Turkey":
			System.out.println("Ankara");
			
			}
			
		}

	}

}
