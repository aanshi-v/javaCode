package code2;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  read a list of integers, filter out the odd numbers using a lambda function, and print them
 * 
 * nums.stream(): Creates a stream from the list of integers.
   .filter(n -> n % 2 != 0): Filters only odd numbers from the stream using a lambda expression.
   .collect(Collectors.toList()): Collects the filtered odd numbers into a new list.
    System.out.println(): Prints the list of odd numbers.
 */
public class OddNumbers {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 23, 14, 15, 9, 10);
		List<Integer> newList = nums.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println(newList); 
		
	}

}
