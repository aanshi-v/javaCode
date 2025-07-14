package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHCL {

	public static void main(String[] args) {
		
		List<EmployeeDto> list = Arrays.asList(
				new EmployeeDto(101, "David", "New York", "USA", 75000, "IT"),
				new EmployeeDto(102, "Bob", "London", "UK", 65000, "HR"),
				new EmployeeDto(103, "Eve", "Delhi", "India", 55000, "Finance"),
				new EmployeeDto(104, "Alice", "Tokyo", "Japan", 85000, "IT"),
				new EmployeeDto(105, "Charlie", "Berlin", "Germany", 70000, "Marketing"),
				new EmployeeDto(105, "Aish", "Berlin", "Germany", 75000, "Marketing")
				);
		
		List<EmployeeDto> sortName = list.stream().sorted(Comparator.comparing(EmployeeDto::getEmpName)).collect(Collectors.toList());   
//		System.out.println(sortName); 
//		sortName.forEach(emp -> System.out.println(emp));   
		sortName.forEach(System.out::println); 
		
		System.out.println("\nRetrieve employees whose names start with the letter \"A\" using Java 8 Streams:-\n");
		
		List<EmployeeDto> empA = list.stream().filter(e -> e.getEmpName().startsWith("A")).sorted(Comparator.comparing(EmployeeDto::getEmpName).reversed()).collect(Collectors.toList());                  
		empA.forEach(System.out::println); 
		
		System.out.println("\nSum of all employees' salaries using Java 8 Streams:-\n");
		double totalSalary = list.stream().mapToDouble(e -> e.getEmpSalary()).sum();      //Employee::getEmpSalary
		System.out.println(totalSalary); 
	}

}















