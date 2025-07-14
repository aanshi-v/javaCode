package code;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Print Distinct Characters from a string
 * 
LinkedHashSet::new:
A method reference to the constructor of LinkedHashSet.
Equivalent to writing () -> new LinkedHashSet<>().

Casting (char) c converts the integer value back to its corresponding Character

________________________________________________________________________

Step 1: str.chars()
[72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33]

Step 2: .mapToObj(c -> (char) c)
['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']

Step 3: .filter(c -> !Character.isWhitespace(c))
This step filters out any whitespace characters.
['H', 'e', 'l', 'l', 'o', ',', 'W', 'o', 'r', 'l', 'd', '!']

Step 4: .collect(Collectors.toCollection(() -> new LinkedHashSet<>()))
Collects the stream elements into a LinkedHashSet, which:
Ensures all elements are unique (removing duplicates).
Preserves the order of insertion.
Why LinkedHashSet?
If you used HashSet, the order of elements would not be maintained.
If you used TreeSet, the elements would be sorted, not insertion-ordered.
Resulting Set:
['H', 'e', 'l', 'o', ',', 'W', 'r', 'd', '!']
__________________________________________________________________________
 */
public class DistinctCharacters {

	public static void main(String[] args) {
		String str = "Hello World!";
		
		
		String str2 = str.chars().distinct().mapToObj(e -> String.valueOf((char)e)).collect(Collectors.joining());
		System.out.println("Str2 after removing duplicate chars :  " + str2); 
		
	//___________________________________________________________________________________	

        Set<Character> distinctChars = findDistinctCharacters(str);

        System.out.println("Distinct characters in the string: " + str);
        for (char c : distinctChars) {
            System.out.print(c + " ");
        }
         
//        System.out.println(distinctChars);
        
	}
	
	public static Set<Character> findDistinctCharacters(String str) {
        return str.chars() 
                .mapToObj(e -> (char) e) 
 //              .collect(Collectors.toSet()); 
                .filter(e -> !Character.isWhitespace(e)) 
                .collect(Collectors.toCollection(LinkedHashSet::new));
//              .collect(Collectors.toCollection(() -> new LinkedHashSet<>())); 
	
         
 
    }

}
