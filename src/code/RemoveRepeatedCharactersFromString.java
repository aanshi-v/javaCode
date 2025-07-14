package code;

import java.util.stream.Collectors;

/**
 * Write a java program to remove repeted character from String using Stream API.
String str = "ababc";
Output: str = "abc"
 */
public class RemoveRepeatedCharactersFromString {

	public static void main(String[] args) {
		
		String str = "abcdecd";
		String newStr = str.chars().distinct().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
		
		System.out.println("after removing duplicates from " + str + ": " + newStr );
	}
}

