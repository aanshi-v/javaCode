package interview;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * Question:7.4- How do you group by + sum using Collectors groupingBy() and summingInt()? 
 * Question: 7.10 - Write a full stream example to group employees by department and find max salary
 */
public class GroupSumExample {

	public static void main(String[] args) {
		
		  List<EmployeeDto> employees = Arrays.asList(
		            new EmployeeDto("Alice", "HR", 5000),
		            new EmployeeDto("Bob", "IT", 7000),
		            new EmployeeDto("Charlie", "HR", 6000),
		            new EmployeeDto("David", "IT", 8000),
		            new EmployeeDto("Eva", "Finance", 6500)
		        );

		        Map<String, Integer> salaryByDept = employees.stream()
		            .collect(Collectors.groupingBy(
		            		EmployeeDto::getDepartment,
		                Collectors.summingInt(EmployeeDto::getSalary)
		            ));
		        System.out.println(salaryByDept);
		        
//___________________________________________________________________________________________________________
		        
// Quest:7.10- Write a full stream example to group employees by department and find max salary		         
		        Map<String, Optional<EmployeeDto>> salaryByDept2 = employees.stream()
			            .collect(Collectors.groupingBy(
			            		EmployeeDto::getDepartment,
			                Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary))
			            ));
		        salaryByDept2.forEach((dept, emp) -> 
		        System.out.println(dept + " -> " + emp.orElse(null))  
		        		);   
		        
	} 

}


