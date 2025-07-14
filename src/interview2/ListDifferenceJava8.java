package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Difference between two lists using Streams. Specifically, you want to get the elements that are in list1 but not in list2.
 */
public class ListDifferenceJava8 {

	public static void main(String[] args) {
		
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
	        List<Integer> list2 = Arrays.asList(3, 4, 8, 9);

	        List<Integer> difference = list1.stream()
	                                        .filter(num -> !list2.contains(num))
	                                        .collect(Collectors.toList());

	        System.out.println("Elements in list1 but not in list2: " + difference);
	}

}
