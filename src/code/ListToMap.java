package code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Convert List to Map
 * [3,3,2,4,2,5,4,6] convert in Map 
 */
public class ListToMap {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 2, 3, 6, 6, 6, 1, 6, 7, 34, 21);
		
		Map<Integer, Long> listToMap = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		
		System.out.println(listToMap); 
		
	}
}



