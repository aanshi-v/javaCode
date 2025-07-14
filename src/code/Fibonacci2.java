package code;

/**
 * 0, 1, 1, 2, 3, 5, 8, 13, 21
 * calculates nth Fibonacci number
 * O(n) time and O(1) space.
 * The loop runs from 2 to n, performing a constant amount of work in each iteration.
 * Only a few variables (a, b, fib) are used, irrespective of the value of n
 */
public class Fibonacci2 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(findFibonacci(n));
	}

	private static int findFibonacci(int n) {
		int a = 0,  b = 1, fib = 0;
		if(n == 0 || n == 1) return n;
		
		for(int i = 2; i <= n; i++) {
			fib = a+b;
			a = b;
			b = fib;			
		}
		return fib; 
	}

}
