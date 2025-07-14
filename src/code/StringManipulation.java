package code;

public class StringManipulation {
		// Method to reverse a string
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    // Method to convert a string to uppercase
	    public static String toUpperCase(String str) {
	        return str.toUpperCase();
	    }

	    // Method to convert a string to lowercase
	    public static String toLowerCase(String str) {
	        return str.toLowerCase();
	    }

	    // Method to replace all occurrences of a character with another character
	    public static String replaceChar(String str, char oldChar, char newChar) {
	        return str.replace(oldChar, newChar);
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        
	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reverseString(str));
	        System.out.println("Uppercase String: " + toUpperCase(str));
	        System.out.println("Lowercase String: " + toLowerCase(str));
	        System.out.println("String after replacing 'o' with 'a': " + replaceChar(str, 'o', 'a'));

	}

}
