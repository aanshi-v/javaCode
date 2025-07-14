package interview;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Quest: 7.5 - How can you sort a grouped result by count? 
 * Quest: 7.6 - Explain partitioningBy () vs groupingBy() in Collectors.
 */
public class SortGroupedByCount {

	public static void main(String[] args) {
		
		 List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

	        // Step 1: Group and count
	        Map<String, Long> wordCount = words.stream()
	            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
	         
	        System.out.println(wordCount);
	        
	        // Step 2: Sort by count (descending) and collect to LinkedHashMap to maintain order
	        Map<String, Long> sortedByCount = wordCount.entrySet().stream()
	        		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	        		.collect(Collectors.toMap(
	        				Map.Entry::getKey,
	        				Map.Entry::getValue,
	        				(e1, e2) -> e1, LinkedHashMap::new
	        				));
	        sortedByCount.forEach((word, count) -> System.out.println(word + "->" + count)); 
	     
	        
	        
//_______________________________________________________________________________________________
//	        Quest: 7.6 - Explain partitioningBy () vs groupingBy() in Collectors.
	//groupingBy() – Group by multiple categories- You want to group elements into more than two groups.        
	        Map<Character, List<String>> grouped =
	        		words.stream()
	        	          .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
	        	System.out.println("grouped: " + grouped);
//______________________________________________________________________________________________
//partitioningBy() – Group into only two groups (true/false) - You want to divide the stream into 2 parts based on a condition.	         	
	        	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

	        	Map<Boolean, List<Integer>> partitioned =
	        	    numbers.stream()
	        	           .collect(Collectors.partitioningBy(n -> n % 2 == 0));

	        	System.out.println("partitioned :" + partitioned);
	        	
	}

}
