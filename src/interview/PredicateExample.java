package interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * Quest: 2.8 - How do you implement Predicate using lambda? Provide a use case. 
 * 
 * filter out strings whose length is greater than 3.
 */
public class PredicateExample {

	public static void main(String[] args) {
		
		   List<String> names = Arrays.asList("Bob", "Alice", "John", "Eve", "Daniel");

		   //This lambda implements the Predicate interface. 
	        Predicate<String> lengthGreaterThan3 = name -> name.length() > 3;

//	        The Stream API uses it to filter elements based on that condition.
	        List<String> filteredNames = names.stream()
	                                          .filter(lengthGreaterThan3)
	                                          .collect(Collectors.toList());

	        System.out.println(filteredNames);  // Output: [Alice, John, Daniel]

	}

}
