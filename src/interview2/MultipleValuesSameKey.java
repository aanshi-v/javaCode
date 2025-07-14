package interview2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleValuesSameKey {

	public static void main(String[] args) {
		
		 Map<Integer, List<String>> map = new HashMap<>();

	        // Add multiple values to same key using computeIfAbsent (Java 8)
	        map.computeIfAbsent(1, k -> new ArrayList<>()).add("abc");
	        map.computeIfAbsent(1, k -> new ArrayList<>()).add("bcd");
	        map.computeIfAbsent(2, k -> new ArrayList<>()).add("xyz");

	        // Print result
	        map.forEach((key, valueList) -> 
	            System.out.println("Key: " + key + ", Values: " + valueList)
	        );

	}

}
