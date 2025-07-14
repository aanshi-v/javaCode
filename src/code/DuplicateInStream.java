package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Find duplicate elements in list
 * 
 * Execution:
Stream: [1, 2, 3, 2, 4, 1]
Filter: Keeps elements with frequency > 1:
1 → Frequency = 2 → Kept.
2 → Frequency = 2 → Kept.
3 → Frequency = 1 → Filtered out.
4 → Frequency = 1 → Filtered out. Result: [1, 2, 2, 1]
Collect to Set: Removes duplicates: Result: [1, 2]

 */
public class DuplicateInStream {
	
//	static Set<Integer> findDuplicate(List<Integer> listInt){
////		Set<Integer> setInt =  listInt.stream().filter(i-> Collections.frequency(listInt, i) > 1).collect(Collectors.toSet());
////		return setInt;
//		return listInt.stream().filter(i-> Collections.frequency(listInt, i) > 1).collect(Collectors.toSet());
//	}
	
	public static void main(String[] args) {
		
		List<Integer> listInt = Arrays.asList(6, 8, 6, 7, 8, 8, 2, 3, 9);
		
//		List<Integer> listInt2 =  listInt.stream().filter(i-> Collections.frequency(listInt, i) > 1).collect(Collectors.toList());     
//		System.out.println("Dublicate elements: " + listInt2);
		
		Set<Integer> setInt =  listInt.stream()
				.filter(i-> Collections.frequency(listInt, i) > 1)
				.collect(Collectors.toSet());
		
		System.out.println("Unique dublicate elements: " + setInt); 
		
//		Set<Integer> setInt2 = findDuplicate(listInt); 
//		System.out.println(setInt2); 
//		System.out.println(findDuplicate(listInt));  
	}
}


