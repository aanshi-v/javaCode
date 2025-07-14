package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * using stream API to sort employee age in Ascending and Descending 
 * And find highest nth older age
 */
public class EmployeeSort {

	public static void main(String[] args) {
		
		int n = 3;
		
		List<EmployeeSortDto> list = Arrays.asList(
				new EmployeeSortDto("Alexa", 26),
				new EmployeeSortDto("devid", 23),
				new EmployeeSortDto("John", 40),
				new EmployeeSortDto("Alica", 18),
				new EmployeeSortDto("Emma", 26)
				);
		
		List<EmployeeSortDto> sortedList = list.stream().sorted(Comparator.comparing(EmployeeSortDto::getAge)).collect(Collectors.toList());                  
		sortedList.forEach(System.out::println); 
		
		List<EmployeeSortDto> descSortedList = list.stream().sorted(Comparator.comparing(EmployeeSortDto::getAge).reversed()).collect(Collectors.toList());     
		System.out.println("\nDescending order: ");
		descSortedList.forEach(System.out::println); 
		
//		Optional<EmployeeSortDto> l = list.stream().sorted(Comparator.comparing(EmployeeSortDto::getAge).reversed()).distinct().skip(n-1).findFirst();  //distinct is not working here   
		Optional<Integer> opt = list.stream().map(EmployeeSortDto::getAge).distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst();
		System.out.println("\n" + n + "th Largest age");
		
		if(opt.isPresent()) {
			List<EmployeeSortDto> l2 = list.stream().filter(e -> e.getAge() == opt.get()).collect(Collectors.toList());
			System.out.println(l2); 
		}else {
			System.out.println("no " + n + "th hightest age available");
		}
		

	}

}
