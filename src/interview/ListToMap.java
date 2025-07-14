package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Quest: 3.2-  How do you convert a list to a map using streams? Handle duplicate keys.
 */
public class ListToMap {

	public static void main(String[] args) {
		
		List<UserDto> users = Arrays.asList(
			    new UserDto(1, "Alice"),
			    new UserDto(2, "Bob"),
			    new UserDto(1, "Alex")  // Duplicate key: id = 1
			);
		
		
		Map<Integer, String> userMap = users.stream()
			    .collect(Collectors.toMap(
			    		UserDto::getId,
			    		UserDto::getName,
			        (existing, replacement) -> existing + "," + replacement  // Merge duplicates
			    ));
			System.out.println(userMap);  // Output: {1=Alice,Alex, 2=Bob}		
//_______________________________________________________________________________________	
			
			Map<Integer, List<String>> grouped = users.stream()
				    .collect(Collectors.groupingBy(
				    		UserDto::getId,
				        Collectors.mapping(UserDto::getName, Collectors.toList())
				    ));
				System.out.println(grouped);  // Output: {1=[Alice, Alex], 2=[Bob]}
				
//_________________________________________________________________________________________
				
				Map<Integer, String> joined = users.stream()
					    .collect(Collectors.groupingBy(
					    		UserDto::getId,
					        Collectors.mapping(UserDto::getName, Collectors.joining(","))
					    ));
					System.out.println(joined);  // Output: {1=Alice,Alex, 2=Bob}
	
					
					
//_____________________________________________________________________________________________________
//Given an array which may contain duplicates, print all elements and their frequencies using java 8
					
					List<Integer> list = Arrays.asList(3, 7, 1, 9, 3, 3, 7, 6, 2);
					Map<Integer, Long> fm = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())); 
					System.out.println(fm);		
					
	//__Sum of numbers_________________________________________	
					
					int r = list.stream()
							.mapToInt(n->n)
//							.mapToInt(Integer :: intValue) 
							.sum();
					System.out.println("Sum of numbers: " + r); 
					
//________________________________________________________________________________________________________
					
					
//___________Quest:3.5- Explain how to use filter, map, and reduce in a chained stream.______________
					
					List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
					String result = names.stream()
						    .filter(name -> name.length() > 3)
						    .map(String::toUpperCase)
						    .reduce("", (a, b) -> a + b);
						    
						    
						System.out.println(result); // Output: ALICECHARLIE
					
					
					
	}

}
