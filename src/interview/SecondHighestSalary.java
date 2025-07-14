package interview;
import java.util.*;

/**
 * Question:3.9- Write a stream operation to find the second-highest salary from a list. 
 */
public class SecondHighestSalary {

	public static void main(String[] args) {
		
		List<Integer> salaries = Arrays.asList(5000, 7000, 8000, 7000, 9000);

		Optional<Integer> secondHighest = salaries.stream()
		    .distinct()                              // Remove duplicates
		    .sorted(Comparator.reverseOrder())       // Sort descending
		    .skip(1)                                  // Skip the highest
		    .findFirst();                             // Get the second highest

		secondHighest.ifPresent(salary -> 
		    System.out.println("Second highest salary: " + salary));

	}

}
