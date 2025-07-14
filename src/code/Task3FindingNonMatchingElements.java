package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author aanshi.vishwakarma
 * Finding non-matching elements from two lists
 *
 */
public class Task3FindingNonMatchingElements {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		List<Integer> nonMatchingElements = new ArrayList<>();
		
		for(Integer num : list2) {
			if(!list1.contains(num))
			{
				nonMatchingElements.add(num);
			}
		}
		
		System.out.println("Non-matching elements from List2: " + nonMatchingElements);
		
		
//********************************************************************************************************	
		

		List<String> l1 = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> l2 = Arrays.asList("banana", "date", "fig", "grape");
		
		List<String> nonMatching = new ArrayList<>();
		
		for(String str : l2) {
			if(!l1.contains(str)) {
				nonMatching.add(str);
			}
		}	 
		System.out.println(nonMatching);
		

		
	}	

}





