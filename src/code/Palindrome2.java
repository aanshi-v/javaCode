package code;

public class Palindrome2 {

	public static void main(String[] args) {
		int n = 121;
		String str = Integer.toString(n);    //Converting Integer to string
				
		String str2 = reverseString(str);    //reverse string method

		System.out.println("Reversed String is:  "+ str2);            //print revere string

		int strtoInt = Integer.parseInt(str2);                //convert string to int
		
		
		if (strtoInt == n) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();        //reverse string
	}

}
