package code;

/**
 * A prime number is a number that can only be divided by itself and 1 without remainders. 
 * print all prime number between 1-100
 */
public class PrimeNo {

	static boolean isPrime(int n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0)return false;

        //Run a loop from 2 to n-1
        for(int i=2; i<n; i++){
          // if the number is divisible by i, then n is not a prime number.
              if(n%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
  }
	
	public static void main(String[] args) {
		
		int num = 100; 
        //check for every number from 1 to num
        for(int n=1; n<=num; n++){
            //check if current number is prime
            if(isPrime(n)) {
                System.out.print(n + " ");
            }
        }
	}

}
