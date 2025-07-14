package interview;

import java.util.Optional;

/**
 * Question:4.3- How do you use ifPresent, orElse, and orElseGet effectively?
 */
public class OptionalExample {

	public static void main(String[] args) {
		
		/*
		 * Executes the given code only if a value is present. 
		 * Use When: You want to do something with the value, but only if it's present.
		 */		
		Optional<String> name = Optional.of("Alice");
		name.ifPresent(n -> System.out.println("Name is: " + n));
		

		Optional<String> empty = Optional.empty();
		empty.ifPresent(n -> System.out.println("This won’t run"));
		
		/*
		 * Returns the value if present, otherwise returns a default value. 
		 * The default value is always created, even if the Optional is not empty.
		 */
		String nameOrElse = (String) Optional.ofNullable(null).orElse("Default");
		System.out.println(nameOrElse); // Output: Default
		
		
		//Returns the value if present, or calls a function to supply a default.
		String nameOrElseGet = (String) Optional.ofNullable(null).orElseGet(() -> "Lazy Default");
		System.out.println(nameOrElseGet);  
		
	}

}
