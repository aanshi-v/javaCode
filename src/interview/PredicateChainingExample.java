package interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Auto-import missing classes - Ctrl + Shift + O 
 *Question:10.2-  Write an example of chaining Predicate conditions.
 * 
 * Key Predicate Methods:
     .and(otherPredicate)

     .or(otherPredicate)

     .negate()
 */

public class PredicateChainingExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        // Define individual predicates
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan20 = n -> n > 20;

        // Chain predicates using AND
        System.out.println("Numbers that are even AND greater than 20:");
        numbers.stream()
               .filter(isEven.and(isGreaterThan20))
               .forEach(System.out::println);

        // Chain predicates using OR
        System.out.println("\nNumbers that are even OR greater than 20:");
        numbers.stream()
               .filter(isEven.or(isGreaterThan20))
               .forEach(System.out::println);

        // Negate predicate
        System.out.println("\nNumbers that are NOT even:");
        numbers.stream()
               .filter(isEven.negate())
               .forEach(System.out::println);

	}

}
