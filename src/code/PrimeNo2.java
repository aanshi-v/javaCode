package code;

/**
 * Check if a number is prime or not
 */
public class PrimeNo2 {
	public static void main(String[] args) {	
		int num = 17;
		if(checkPrime(num)) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}

	private static boolean checkPrime(int num) {
		if(num <= 1) {
			return false;
		}		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}	
		return true;
	}
}













