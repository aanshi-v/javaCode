package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * comparable And comparator are used for sorting 
 * Comparator - used when we have to sort according to multiple logic. used for multiple sorting logic
 * Comparator - used when we have to sort on single variable
 */
public class MyComparable {

	public static void main(String[] args) {
		
		ArrayList<EmpDto> arr = new ArrayList<>();
		arr.add(new EmpDto("Aanshi", "1234", 3));
		arr.add(new EmpDto("Pooja", "7890", 2));
		arr.add(new EmpDto("Priya", "5678", 9));
		
		System.out.println(arr); 
		
		Collections.sort(arr);
		
		System.out.println("Sorted Array as per id: " + arr); 
	}

}
