package code3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 15, 21, 1, 123, 45, 19, 78, 101);

	        // Filter numbers that start with '1' using regex
	        List<Integer> filteredNumbers = numbers.stream()
//	                .filter(num -> String.valueOf(num).matches("^1.*"))  // Regex check
	        		.filter(num -> String.valueOf(num).startsWith("1"))  
	                .collect(Collectors.toList());

	        System.out.println("Numbers starting with 1: " + filteredNumbers);
	       
//___________________________________________________________________________________
	        
	        List<String> str = Arrays.asList("Java", "Python", "Java", "Java", "java", "C++", "Go");
	        List<String> filterStr = str.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList());
	        System.out.println("filterStr : " + filterStr); 
	        
	        
	}
 
}
 