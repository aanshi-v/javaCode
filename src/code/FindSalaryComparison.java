package code;

import java.util.HashMap;
import java.util.Map;

/**
 * using stream api find salary more then 30k and less then 30k
 * 
 * entrySet(): Converts a Map into a set of key-value pairs.
 * salaryMap.entrySet() produces:
[Map.Entry("Alice", 4000), Map.Entry("Bob", 2500), Map.Entry("Charlie", 5000)]
 */
public class FindSalaryComparison {

	public static void main(String[] args) {
		
//		Map<String, Integer> salaryMap = new HashMap<>();
//		salaryMap.put("Aanshi", 3000);
//		salaryMap.put("Aish", 2500);
//		salaryMap.put("Pooja", 4000);
//		salaryMap.put("Alexa", 5000);
		
		Map<String, Integer> salaryMap = Map.of(
				"Aanshi", 3000,
	             "Aish", 2500,
		        "Pooja", 4000,
		         "Alexa", 5000
				);
		
		System.out.println("Employees with salary more than 3000:");
		salaryMap.entrySet().stream().filter(e -> e.getValue() > 3000).forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		
		System.out.println("Employees with salary less than 3000:");
		salaryMap.entrySet().stream().filter(e -> e.getValue() < 3000).forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		 

	}

}
