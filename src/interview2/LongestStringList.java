package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1-  Return One Longest String
 * 2-  Return All Strings With Max Length
 * 
 * mapToInt is just a way to convert object stream → int stream for numeric operations like sum, average, min, max, etc.
 */
public class LongestStringList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Programming", "AI", "SpringBoot");

        String longest = list.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(null);

        System.out.println("Longest string: " + longest);
        
 //___________________________________________________________________________________
        
        int maxLength = list.stream()
//                .mapToInt(String::length)
        		.mapToInt(s -> s.length())
                .max()
                .orElse(0);

        List<String> longestStrings = list.stream()
                .filter(s -> s.length() == maxLength)
                .collect(Collectors.toList());

        System.out.println("Longest strings: " + longestStrings);
        
        
 //___________________________________________________________________________________
        
        int sum = list.stream()
                .mapToInt(s -> s.length())
                .sum();
           System.out.println("Sum of lengths: " + sum);
	}

}
