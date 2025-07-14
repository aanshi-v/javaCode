package code;

import java.util.stream.Collectors;

/**
 * Check whether two Strings are anagram of each other using java 8
 For example, “abcd” and “dabc” are an anagram of each other.
 
 
 String sortedS1 = s1.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
 
 s1.chars()

Converts the string s1 into an IntStream of its Unicode code points (essentially the integer values of the characters in the string).
For example, if s1 = "bca", s1.chars() produces an IntStream of [98, 99, 97] (ASCII values of 'b', 'c', and 'a').

.sorted()

Sorts the IntStream of character codes in ascending order.
For the input [98, 99, 97], the sorted stream becomes [97, 98, 99].

.mapToObj(i -> String.valueOf((char)i))

Maps each integer (i) back to its character representation ((char)i) and converts it to a String.
String.valueOf((char)i) ensures the integer is cast back to a character and then converted to a String object.
For [97, 98, 99], this produces a Stream<String> of ["a", "b", "c"].

.collect(Collectors.joining())

Joins all the strings in the stream into a single String, without any delimiter.
The result is "abc".
 */
public class Anagram2 {

	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		Boolean result = checkAnagram(s1, s2);
		
		if(result) {
			System.out.println(s1 + " and " + s2 + " are anagram of each other");
		}else {
			System.out.println(s1 + " and " + s2 + " are not anagram of each other");
		}
	}

	private static Boolean checkAnagram(String s1, String s2) { 
		
		if(s1.length() != s2.length()) {
			return false;
		}
		String sortedS1 = s1.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		String sortedS2 = s2.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		
		return sortedS1.equals(sortedS2);
	}

}














