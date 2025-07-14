package code;

import java.util.ArrayList;
import java.util.List;

//An element is a leader if it is greater than all the elements to its right. The last element is always considered a leader.
public class FindLeaders {

	public static void main(String[] args) {
		int[] a = {16, 17, 4, 3, 5, 2};
		findLeaders(a);  // Output: 17, 5, 2
	}

	private static void findLeaders(int[] a) { 
		List<Integer> list = new ArrayList<>();
		int l = a.length;
		int maxFromRight = a[l-1];
		list.add(maxFromRight);
		
		for(int i = l-2; i >= 0; i--) {
			if(a[i] > maxFromRight) {
				maxFromRight =a[i];
				list.add(maxFromRight);					
			}
		}
		
		System.out.println("size of list: " + list.size());
		 
		for(int i = list.size()-1; i>=0; i--) {
//		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i)); 
		}
		
	}

}
