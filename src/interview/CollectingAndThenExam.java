package interview;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Quest: 7.7 - How do you use collectingAndThen () for post-processing results?
 * 
 * Collectors.collectingAndThen(Collector<T, A, R> downstream, Function<R, RR>)
 * downstream: the actual collector (like toList(), groupingBy(), etc.)
 * Function: a function to transform the result (e.g., make list unmodifiable, get size, wrap, etc.)
 * 
 */
public class CollectingAndThenExam {

	public static void main(String[] args) {
		
// Example 1: Make List Unmodifiable
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		List<String> unmodifiableNames = names.stream()
		    .collect(Collectors.collectingAndThen(
		        Collectors.toList(),
		        Collections::unmodifiableList
		    )); 
		System.out.println("unmodifiableNames: " + unmodifiableNames);
		
//____________________________________________________________________________
//Example 2: Count elements after filtering
		long count = (long) Stream.of("a", "bb", "ccc", "dddd")
			    .filter(s -> s.length() > 2)
			    .collect(Collectors.collectingAndThen(
			        Collectors.toList(),
			        List::size
			    ));

			System.out.println(count); // Output: 2

//___________________________________________________________________________
//Example 3: Get top N elements (custom logic)
			List<Integer> top3 = Stream.of(5, 1, 9, 2, 10, 3)
				    .sorted(Comparator.reverseOrder())
				    .limit(3)
				    .collect(Collectors.collectingAndThen(
				        Collectors.toList(),
				        Collections::unmodifiableList
				    ));

				System.out.println(top3); // [10, 9, 5]
		
		
	}

}









