package code;

/**
 * Time Complexity: O(n)
 * Space Complexity : O(1)
 */
public class Factorial2 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(findFactorial(n));
	}

	private static long findFactorial(int n) {
		if(n == 0) return 1;
		if(n < 0) return -1;
		
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
		
	}

}
