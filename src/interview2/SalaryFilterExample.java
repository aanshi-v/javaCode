package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryFilterExample {

	public static void main(String[] args) {
		
		  List<Employee> employees = Arrays.asList(
		            new Employee("Alice", 18000),
		            new Employee("Bob", 25000),
		            new Employee("Charlie", 22000),
		            new Employee("David", 15000)
		        );

		        List<Double> doubledSalaries = employees.stream()
		            .filter(emp -> emp.getSalary() > 20000)
		            .map(emp -> emp.getSalary() * 2)
		            .collect(Collectors.toList());

		        // Output the result
		        doubledSalaries.forEach(System.out::println);
	}

}
