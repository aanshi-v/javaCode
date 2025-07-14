package code;

/**
 * Check if number is palindrome or not
 */
public class Palindrome3 {

	public static void main(String[] args) {
		
		int n = 121;
		String s1 = Integer.toString(n);
		String reversedString = new StringBuilder(s1).reverse().toString();
				
		if(s1.equals(reversedString)) {
			System.out.println(n + " is Palindrome no");
		}else {
			System.out.println(n + " is not Palindrome no");
		}
		
//		Boolean result = isPalindrome(n);
//		System.out.println(n + " is Palindrome no : " + result); 
	}

//	private static Boolean isPalindrome(int n) { 
//		String s1 = Integer.toString(n);
//		String reversedString = new StringBuilder(s1).reverse().toString();
//		return s1.equals(reversedString); 
//	}
}





