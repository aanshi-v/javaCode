package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LogStream {

	public static void main(String[] args) {
		
				
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		List<String> result = names.stream()
		    .peek(name -> System.out.println("Original: " + name))       // Log original
		    .filter(name -> name.length() > 3)
		    .peek(name -> System.out.println("Filtered: " + name))       // Log after filter
		    .map(String::toUpperCase)
		    .peek(name -> System.out.println("Mapped: " + name))         // Log after map
		    .collect(Collectors.toList());
		
		System.out.println("result: " + result); 
		
		
		
		//error
//		private static final Logger logger = Logger.getLogger(MyClass.class.getName());
//		List<String> result = names.stream()
//		.peek(name -> logger.info("Original: " + names));
			

	}

}
