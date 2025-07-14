package code;

import java.util.HashMap;
import java.util.Map;

/**
 * write a java program to increase salary of employee by 10% whose salary is 30k
 */
public class IncreaseSalary {

	public static void main(String[] args) {
		
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("Aanshi", 3000);
		salaryMap.put("Aish", 2500);
		salaryMap.put("Pooja", 4000);
		salaryMap.put("Alexa", 5000);
		
		System.out.println("Salaries before increase:");
		salaryMap.forEach((name , salary) -> System.out.println(name + " : " + salary));
		
		salaryMap.entrySet().stream().filter(e -> e.getValue() == 3000).
//		forEach(e -> System.out.println(e.getKey() + " : " + e.getValue() * 1.1 ));
		forEach( e -> e.setValue((int) (e.getValue() * 1.1)));
		
		System.out.println("\nSalaries after increase:");
		salaryMap.forEach((name, salary) -> System.out.println(name + " : " + salary)); 
	}
}
