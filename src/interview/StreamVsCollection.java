package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question:1.2- What are streams in Java 8? How are they different from collections?
 * 
 * Use Collections to store and manage data.

Use Streams to process data functionally and declaratively.

Streams make code more readable and concise, especially for filtering, mapping, and reducing operations.

 */
public class StreamVsCollection {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		List<String> result1 = new ArrayList<>();
		for (String name : names) {
		    if (name.length() > 3) {
		        result1.add(name.toUpperCase());
		    }
		}
		System.out.println("result1 :" + result1);
//_____________________________________________________________________		
		
		List<String> result2 = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		 
		System.out.println("result2 :" + result2);

	}

}
