package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Quset: 1.3 - Explain the functional syntax of a lambda and give an example with a Comparator.
 * Quest: 1.8 - Write a lambda expression to sort a list of employees by name. 

 * 1) Sort a list of numbers in ascending order using a lambda with Comparator.
 *  Explanation:
(a, b) → Two numbers to compare

-> → Lambda arrow

a - b → If result is:

Negative → a comes before b

Zero → a and b are equal

Positive → a comes after b
__________________________________________________________

 * 2)  Sort a list of names (Strings) in alphabetical order using a lambda expression.
names is a list of strings.

Collections.sort() takes a list and a comparator.

The lambda: (name1, name2) -> name1.compareTo(name2)

Compares two strings.

Returns:

Negative if name1 comes before name2.

Zero if they're equal.

Positive if name1 comes after name2.

 */
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // Lambda expression to compare two integers
        Collections.sort(numbers, (a, b) -> a - b);

        System.out.println(numbers); // Output: [1, 2, 3, 5, 8]
        
  //_________________________________________________________________________
        
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Using lambda expression to sort names in alphabetical order
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println(names); // Output: [Alice, Bob, John]
        
   //__________________________________________________________________________
   //Quest: 1.8 - Write a lambda expression to sort a list of employees by name. 
        
        List<String> employees = Arrays.asList("Charlie", "Alice", "Bob");

        // Sort using lambda
        employees.sort((e1, e2) -> e1.compareTo(e2));
        
      //Even shorter using method reference:      
//        employees.sort(String::compareTo); 

        // Print sorted names
        System.out.println(employees); // Output: [Alice, Bob, Charlie]
//        employees.forEach(System.out::println);
        
       
        

	} 

}
