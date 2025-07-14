package interview2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryName {

	public static void main(String[] args) {
		
		 List<Employee> emp = Arrays.asList(
		            new Employee(1, "Alice", 18000),
		            new Employee(3, "Bob", 25000),
		            new Employee(2,"Charlie", 22000),
		            new Employee(8, "David", 15000)
		        );
		 
		 
		 List<String> list = emp.stream().filter(e -> e.getSalary() > 20000)
					.map(e -> e.getName())
					.collect(Collectors.toList());
			System.out.println("list:" + list);  
			
//_________________________________________________________________________________
			
			Map<Integer, String> result = emp.stream()
				    .filter(e -> e.getSalary() > 20000)
				    .collect(Collectors.toMap(
				    		Employee::getId,
				    		Employee::getName
				    ));
			System.out.println("result:" + result); 
	}

}









