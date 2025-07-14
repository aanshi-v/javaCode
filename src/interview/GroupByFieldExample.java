package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Quest:7.1- How do you group a list of objects by a field using streams?
 */
public class GroupByFieldExample {
	public static void main(String[] args) {
		
		 List<EmployeeDto> employees = Arrays.asList(
		            new EmployeeDto("Alice", "HR"),
		            new EmployeeDto("Bob", "IT"),
		            new EmployeeDto("Charlie", "HR"),
		            new EmployeeDto("David", "IT"),
		            new EmployeeDto("Eva", "Finance")
		        );
		 
		// Grouping by department
	        Map<String, List<EmployeeDto>> employeesByDept = employees.stream()
	            .collect(Collectors.groupingBy(EmployeeDto::getDepartment));
	        
	        employeesByDept.forEach((dept, empList) -> {
	        	System.out.println(dept + ":" + empList.stream().map(EmployeeDto::getName).collect(Collectors.joining(", ")));
	        });
		
	}
 
}


