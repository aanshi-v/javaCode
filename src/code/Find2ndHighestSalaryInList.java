package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Find 2nd highest employee salary in arrayList
 */
public class Find2ndHighestSalaryInList {

	public static void main(String[] args) {
		
		List<Find2ndHighestSalaryInListDto> list = Arrays.asList(
				new Find2ndHighestSalaryInListDto("Alice", 5000),
				new Find2ndHighestSalaryInListDto("Bob", 6000),
	            new Find2ndHighestSalaryInListDto("Charlie", 7500),
	            new Find2ndHighestSalaryInListDto("David", 8000),
	            new Find2ndHighestSalaryInListDto("Eve", 6000),
	            new Find2ndHighestSalaryInListDto("Frank", 7500)
				);
		
		int n = 3;
			
			Optional<Integer> opt = list.stream().map(Find2ndHighestSalaryInListDto::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst();  
//		Optional<Find2ndHighestSalaryInListDto> opt = list.stream().sorted(Comparator.comparing(Find2ndHighestSalaryInListDto::getSalary).reversed()).distinct().skip(n-1).findFirst();    //distinct is not working here    
		
			
		if(opt.isPresent()) {
//			System.out.println(opt.get());		
			List<Find2ndHighestSalaryInListDto> l = list.stream().filter(e -> e.getSalary() == opt.get()).collect(Collectors.toList());
			System.out.println(l);
//			l.forEach(System.out::println);
//			System.out.println(opt.get()); 
		}else {
			System.out.println("no value");
		}		
	}
}















