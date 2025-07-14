package code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * merge two unsorted arrays into single sorted array using Java 8 streams
 * 
 * IntStream.concat(Arrays.stream(a1), Arrays.stream(a2))
Merges two streams (from a1 and a2) into a single IntStream.
Example:
a1 = {1, 3, 5};
a2 = {2, 3, 6};
The resulting stream is: [1, 3, 5, 2, 3, 6]
 */
public class MergeToArrays {

	public static void main(String[] args) {
		int[] a1 = {5, 8, 2, -2, -6, 14, 10};
		int[] a2 = {3, 2, 16, 26, 8};
		
		int[] result = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(result));  
			
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " "); 
		}
		
		
		
		
		System.out.println("\n\n______Merged List using ArayList:-__________");
		
		List<Integer> list1 = Arrays.asList(5, 8, 2, -2, -6, 14, 10);
		List<Integer> list2 = Arrays.asList(3, 2, 16, 26, 8);
		
		List<Integer> listMerged = Stream.concat(list1.stream(), list2.stream()).sorted().distinct().collect(Collectors.toList());                     
		System.out.println(listMerged); 
		
		
		
		
		
		
		System.out.println("\n\n__________Add to string________");
		String s1 = "Aanshi";
		String s2 = "Vishwakarma";
		String r = Stream.of(s1, s2).collect(Collectors.joining(" "));    //add a space between two strings
		System.out.println(r); 
	
	}
}









