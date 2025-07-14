package code2;

/**
 * Java code to reverse a given String
 * 
 * new StringBuilder(input): Creates a StringBuilder object initialized with the input string.
   .reverse(): Reverses the characters in the StringBuilder.
   .toString(): Converts the reversed StringBuilder back into a String
 * 
 */
public class ReverseString {

	public static void main(String[] args) {
		
		String input = "Hello World";
		String reversedString = new StringBuilder(input).reverse().toString();
		System.out.println(reversedString); 
	}
}
