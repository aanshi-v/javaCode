package code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Given an array which may contain duplicates, print all elements and their frequencies using java 8
 * 
 * Arrays.stream(a) converts the array into a Stream<Integer> for processing.
 * 
 * Collectors.groupingBy(Function.identity(), Collectors.counting()):

Function.identity(): Represents a function that returns the element itself (acts like x -> x).
Collectors.counting(): Counts the number of occurrences of each element in the stream.
The groupingBy collector creates a Map where:

Keys are the elements of the array (Integer values).
Values are the frequencies of those elements (Long values).
 * 
 */
public class FrequencyOfElements  {

	public static void main(String[] args) {
		
//		Integer[] a = {3, 7, 1, 9, 3, 3, 7, 6, 2};
		List<Integer> list = Arrays.asList(3, 7, 1, 9, 3, 3, 7, 6, 2);
		
//		Map<Integer, Long> fm = Arrays.stream(a).collect(Collectors.groupingBy
//				(Function.identity(), Collectors.counting()));
//		
//		fm.forEach((element, frequency) -> System.out.println("Frequency of "+ element + " is " + frequency));
		
//		Map<Integer, Long> fm = Arrays.stream(a).collect(Collectors.groupingBy
//		(e -> e , Collectors.counting()));
		
//		System.out.println(fm);
		
		Map<Integer, Long> fm = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())); 
		System.out.println(fm); 
				
		 
	}
} 
