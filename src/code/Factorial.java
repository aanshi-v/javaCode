package code;


/**
 * factorial of a given non-negative integer.
 * n! = n × (n - 1)!
 * n! = n × (n-1) × (n-2) × (n-3) × ….× 3 × 2 × 1
 * 
 * 	Time Complexity: O(n)
 * Space Complexity : O(n)
 */
public class Factorial {
				public static void main(String []args) {

			    int a = 5;
			    System.out.println(findFact(a));
			    } 
				
			static int findFact(int a){

			  if(a == 0 ){
			    return 1;
			  }
			return  a * findFact(a-1);
			}
	}

