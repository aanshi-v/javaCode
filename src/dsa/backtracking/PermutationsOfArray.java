package dsa.backtracking;

/**
 * print all permutations of an Array- in How many ways we can arrange elements
 * n=3, TC: O(n! * n)
 * SC: O(n)
 */
public class PermutationsOfArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		permute(a, 0, a.length-1);  
		
	}
	
	static void permute(int a[], int l, int r) {
		if(l == r) {
			printArray(a);
			return;
		}
		for(int i = l; i <= r; i++) {
			swap(a, i, l);
			permute(a, l+1, r); 
			swap(a, i, l);       //backtracking
		}
	}

	private static void swap(int[] a, int i, int j) { 
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void printArray(int[] a) { 
		for(int e: a) {
			System.out.print(e);
		}
		System.out.println(); 
	}

}




