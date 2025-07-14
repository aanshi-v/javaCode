package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aanshi.vishwakarma
 * Copying elements from list1 to list2
 *
 */
public class Task1CopyElements {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
//		list1.add(5);
//		list1.add(2);
//		list1.add(8);
//		list1.add(4);
//		list1.add(5);
//		list1.add(6); 
		
		for(int i=1; i<=6; i++) {
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		
		System.out.println("List1: " + list1);
		System.out.println("List2 after copyng from list1: " + list2);
		
	}

}
