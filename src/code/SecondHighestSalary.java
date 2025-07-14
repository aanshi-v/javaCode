package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecondHighestSalary {

	public static void main(String[] args) {
		Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Stark", 1000);
        salaryMap.put("Alex", 5000);
        salaryMap.put("Steve", 2000);
        salaryMap.put("Drake", 4000);
        
        Integer secondHighestSalary = findSecondHighestSalary(salaryMap);
        if (secondHighestSalary != null) {
            System.out.println("The second highest salary is: " + secondHighestSalary);
        } else {
            System.out.println("There are not enough distinct salaries to determine the second highest.");
        }

	}

	private static Integer findSecondHighestSalary(Map<String, Integer> salaryMap) {
		// Create a set to store unique salaries
//        Set<Integer> salaries = new HashSet<>(salaryMap.values());
//        
//     // If there are fewer than 2 unique salaries, return null
//        if (salaries.size() < 2) {
//            return null;
//        }
//        
//     // Convert the set to a list and sort it in descending order
//        List<Integer> sortedSalaries = new ArrayList<>(salaries);
//        Collections.sort(sortedSalaries, Collections.reverseOrder());
//     // Return the second highest salary
//        return sortedSalaries.get(1); 
        
             
        return salaryMap.values().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null); // Return null if there is no second highest salary
	}

}
