package interview;

import java.util.Optional;


/**
 * I didn't understand. 
 * Question:4.5- How does flatMap work on Optionals? Use case? 
 * 
 * It avoids getting nested Optional<Optional<U>> and instead gives you just Optional<U>.
 */
public class FlatMapExample {

	public static void main(String[] args) {
		
		Optional<String> name = Optional.of("Alice");

		// map returns Optional<Optional<Integer>>
		Optional<Optional<Integer>> result1 = name.map(n -> Optional.of(n.length()));
		System.out.println("Result using map(): " + result1);

		// flatMap returns Optional<Integer>
		Optional<Integer> result2 = name.flatMap(n -> Optional.of(n.length()));
		 System.out.println("Result using flatMap(): " + result2);

	}  

}
