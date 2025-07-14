package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Count Employees per Department
 */
public class CountEmployeesPerDepartment {

	public static void main(String[] args) {
		
		 List<Employee> employees = Arrays.asList(
		            new Employee("Alice", "HR"),
		            new Employee("Bob", "IT"),
		            new Employee("Charlie", "IT"),
		            new Employee("David", "Finance"),
		            new Employee("Eva", "HR")
		        );

		        Map<String, Long> departmentCount = employees.stream()
//		            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		        		.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));

		        // Output the result
//		        departmentCount.forEach((dept, count) -> 
//		            System.out.println(dept + ": " + count));
		        
		        System.out.println(departmentCount); 
		    }

}





