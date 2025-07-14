package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TC: O(nlogn) 
 */
public class MinDifference {

	public static void main(String[] args) {
		int a[] = {12, 9, 8, 2, 11};
		List<List<Integer>> ans = minimumDifferene(a);
		System.out.println(ans); 
	}
	
	static List<List<Integer>> minimumDifferene(int a[]){
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(a);
		int n = a.length;		
		int minDiff = Integer.MAX_VALUE;     //largest possible integer value
		for(int i = 1; i<n; i++) {
//			if(a[i] - a[i-1] < minDiff) {
//				minDiff = a[i] - a[i-1];
//			}
			minDiff = Math.min(minDiff, a[i] - a[i-1]);   ///compare both argument and update minDiff with smaller number 
		}
		for(int i = 1; i<n; i++) {
			if(a[i] - a[i-1] == minDiff) {
				List<Integer> temp = new ArrayList<>();
				temp.add(a[i-1]);
				temp.add(a[i]);
				ans.add(temp);
			}
		}
		return ans; 
	}

}










