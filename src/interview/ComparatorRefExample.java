package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Quest:8.9 - How do method references work in comparator chaining?
 * 
 * Method references are very useful in comparator chaining when you sort objects by multiple fields using
 *  Comparator.comparing() and related methods.
 *  
 *  Comparator.comparing(ClassName::getFieldName)
 *  
 *  You can chain multiple comparators using .thenComparing().
 */
public class ComparatorRefExample {

	public static void main(String[] args) {
		
		  List<EmployeeDto> employees = Arrays.asList(
		            new EmployeeDto("Alice", "HR", 5000),
		            new EmployeeDto("Bob", "IT", 7000),
		            new EmployeeDto("Charlie", "HR", 6000),
		            new EmployeeDto("David", "IT", 8000),
		            new EmployeeDto("Eva", "Finance", 6500)
		        );
		  
		  employees.stream()
          .sorted(
              Comparator.comparing(EmployeeDto::getDepartment)
                        .thenComparing(EmployeeDto::getName)
          ).forEach(System.out::println);
	}

}
