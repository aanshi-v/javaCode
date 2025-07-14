package code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * remove duplicate elements from a list using Java 8 streams.
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Java", "Python", "Java", "Java", "java", "C++", "Go");
		
		List<String> newStr = str.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newStr); 
	}
}
