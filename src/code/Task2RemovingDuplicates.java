package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author aanshi.vishwakarma
 * Removing duplicates from list
 *
 */
public class Task2RemovingDuplicates {
	public static void main(String[] args) {
		
		List<Integer> listWithDuplicates = new ArrayList<>();
		
		listWithDuplicates.add(4);
		listWithDuplicates.add(2);
		listWithDuplicates.add(3);
		listWithDuplicates.add(4);
		listWithDuplicates.add(6);
		listWithDuplicates.add(6);
		
		Set<Integer> uniqueElements = new HashSet<>(listWithDuplicates);
		
		List<Integer> listwithoutDuplicates = new ArrayList<>(uniqueElements);
		
		System.out.println("List with duplicates: " + listWithDuplicates);
		System.out.println("unique set: "+ uniqueElements); 
		System.out.println("List without duplicates: " + listwithoutDuplicates);

	}

}
