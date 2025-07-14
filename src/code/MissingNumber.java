package code;

import java.util.Arrays;

/**
 * Find the Missing Number in array using java 8
 * int l = a.length + 1; // Length of the complete sequence, including the missing number.
 */
public class MissingNumber {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 4, 5, 6};
		int n = a.length + 1;
		
		int expSum = n * (n+1)/2;   
		int actualSum = Arrays.stream(a).sum();
		int missingNum = expSum - actualSum;
		System.out.println("Missing no is: " + missingNum);
	}
}

