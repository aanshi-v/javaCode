package code;

import java.util.Arrays;

/**
 move all the positive numbers to the end of the array and the negative-numbers to the beginning of the array. 
 */
public class MoveNegativeNotoLeft {

	public static void main(String[] args) {
		int[] a = {6, 2, -4, -1, -2, 7, -2, 9, 8, 24, 13};
		Arrays.sort(a);
		for(int i : a) {
			System.out.println(i); 
		}
	}
}
