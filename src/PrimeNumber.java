
public class PrimeNumber {
	String isPrime(int num) {
		// take range of numbers from 2 to 100 and print all prime
				// 2, 3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)

				
				boolean b=true;
				String result;

				if (num <= 1) {
					b = false;
					
				} else {
					for (int i = 2; i < num; i++) {

						if (num % i == 0) {
							b = false;
							
							break;
						}
					}
				}

				if (b) {
					result=num+" is a prime number";
				} else {
					result=num+" is NOT a prime number";
				}
				return result;
				
	}
	public static void main(String[] args) {
		PrimeNumber prime=new PrimeNumber();
		String num1=prime.isPrime(33);
		System.out.println(num1);
		
	}

}
