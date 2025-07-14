package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * There are two list and some data are common, How to extract non duplicate values from both list using java
 */
public class UniqueElementsUsingFrequency {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        // Combine both lists
        List<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);

        // Find unique elements (elements appearing only once)
        List<Integer> uniqueElements = combinedList.stream()
                .filter(num -> Collections.frequency(combinedList, num) == 1)
                .collect(Collectors.toList());

        System.out.println("Unique elements: " + uniqueElements);
	}

}
