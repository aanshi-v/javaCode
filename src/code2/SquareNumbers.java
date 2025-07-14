package code2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * from a given list of integers, square the number and return in the list using stream API
 * 
 * nums.stream(): Creates a stream from the list of integers.
  .map(n -> n * n): Applies the square operation on each number in the stream.
  .collect(Collectors.toList()): Collects the processed elements into a new list.
 */
public class SquareNumbers {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> newList = nums.stream().map(n -> n * n).collect(Collectors.toList()); 
		System.out.println(newList); 
	}

}
