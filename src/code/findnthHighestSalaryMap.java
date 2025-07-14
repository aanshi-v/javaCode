package code;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class findnthHighestSalaryMap {

	public static void main(String[] args) {
		
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("Aanshi", 3000);
		salaryMap.put("Aish", 2500);
		salaryMap.put("Pooja", 4000);
		salaryMap.put("Alexa", 5000);
		salaryMap.put("xyz", 4000);
		
		int n = 3;
		
//		Integer opt = salaryMap.values().stream().distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().orElse(null);        		
//		System.out.println(opt); 
		
//		Optional<Entry<String, Integer>> opt = salaryMap.entrySet().stream().distinct().sorted(Entry.comparingByValue(Comparator.reverseOrder())).skip(n-1).findFirst();      
//		Optional<Entry<String, Integer>> opt = salaryMap.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).skip(n-1).findFirst();      
		
		Optional<Integer> opt = salaryMap.values().stream().distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst();
		
		if(opt.isPresent()) {
//			System.out.println(n + "th highest salary is: " + opt.get().getValue() + " and Employee Name is: " + opt.get().getKey());
			 Map<String, Integer> map2 = salaryMap.entrySet().stream().filter(e -> e.getValue() == opt.get())
					 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));   
			 System.out.println("map2 : " + map2);
		}else {
			System.out.println("There is no " + n + "th highest salary"); 
		}	

	}
}
