package code3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingMap {

	public static void main(String[] args) {
		
		// Input map with duplicate values
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 5000);
        map.put("Bob", 7000);
        map.put("Charlie", 5000); // Duplicate value
        map.put("Diana", 8000);
        map.put("Eve", 7000);     // Duplicate value

        // Remove duplicate values
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> uniqueMap = map.entrySet()
            .stream()
            .filter(e -> set.add(e.getValue())) // Add value to Set and filter duplicates
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));

        // Print the result
        System.out.println("Original Map: " + map);
        System.out.println("Map without duplicate values: " + uniqueMap);

	}

}
