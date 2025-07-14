package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		
//Example 1: Sorting with Method Reference
		List<String> names = Arrays.asList("John", "Alice", "Bob");

		// Lambda
		Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

		// Method reference
		Collections.sort(names, String::compareToIgnoreCase);
		
		System.out.println(names + "\n"); 
//________________________________________________________________		
// Example 2: Printing with Method Reference
		// Lambda
		names.forEach(name -> System.out.println(name));

		// Method reference
		names.forEach(System.out::println);	
		
		
//___________________________________________________________________
		
		
		
	}

}












