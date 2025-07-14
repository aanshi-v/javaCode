package code;

/**
 * Fn = Fn-1 + Fn-2, where n > 1. 
 *  It is used to generate a term of the sequence by adding its previous two terms.
 *  The time complexity is O(2^n) due to the exponential growth of recursive calls.
 *  Space Complexity:
Each recursive call adds to the call stack, so the space complexity is O(n) for the depth of recursion.
 *  
 *  Result Calculation:
After resolving all recursive calls:

F(2) = F(1) + F(0) = 1 + 0 = 1
F(3) = F(2) + F(1) = 1 + 1 = 2
F(4) = F(3) + F(2) = 2 + 1 = 3
F(5) = F(4) + F(3) = 3 + 2 = 5
F(6) = F(5) + F(4) = 5 + 3 = 8
F(7) = F(6) + F(5) = 8 + 5 = 13
F(8) = F(7) + F(6) = 13 + 8 = 21

 */
public class Fibonacci {

	public static void main(String[] args) {
		
		 int n = 8;
		    System.out.println(findFibonacci(n));

	}

	private static int findFibonacci(int n) { 
		 if(n == 0 || n == 1 ){
			    return n;
			  }
			return  findFibonacci(n-1) + findFibonacci(n-2);
  }
}	
