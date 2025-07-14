package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class MyComparator {

	public static void main(String[] args) {
		
		ArrayList<EmpDtoComparator> arr = new ArrayList<>();
		arr.add(new EmpDtoComparator("Aanshi", "1234", 3));
		arr.add(new EmpDtoComparator("Riya", "7890", 2));
		arr.add(new EmpDtoComparator("Priya", "5678", 9));
		
		System.out.println(arr); 
		
		Collections.sort(arr, new IdComparator());       //sort by id
		
		System.out.println("Sorting using Comparator: " + arr);
		
		
		ArrayList<EmpDtoComparator> arr2 = new ArrayList<>(arr);
		Collections.sort(arr2, new NameComparator());                  //sort by name
		System.out.println("Sorting by Name: " + arr2);

	} 

}
