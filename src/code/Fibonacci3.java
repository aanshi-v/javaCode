package code;

public class Fibonacci3 {

	public static void main(String[] args) {
		int n = 10;
		findFibonacciNumbers(n);

	}
	private static void findFibonacciNumbers(int n) {
		int a = 0, b = 1, fib = 0;
		for(int i = 0; i < n; i++) {
			System.out.print(a + " ");
			fib = a + b;
			a = b;
			b = fib;			
		}
				
	}
}
