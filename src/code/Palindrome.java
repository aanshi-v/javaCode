package code;

public class Palindrome {
	
	
	 static int reverse(int n) 
	    { 
	        // reversed number 
	        int rev = 0; 
	        // remainder 
	        int rem; 
	  
	        while (n > 0) { 
	            rem = n % 10; 
	            rev = (rev * 10) + rem; 
	            n = n / 10; 
	        } 
	  
	        return rev; 
	    } 

	public static void main(String[] args) {
		
//		 int n = 4526;
		 int n = 121;
		  
	     System.out.println("Reversed Number is "
	                         + reverse(n)); 
	     
	     if(reverse(n) == n) {
	    	 System.out.println("No is Palindrome");
	     }else {
			System.out.println("No is not Palindrome");
		}

	}

}
