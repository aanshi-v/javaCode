package dsa.arrays;

/**
 * TC: O(n) 
 */
public class MultipleLeftRotationOfArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {2, 3, 20, 21};         //here elements indicating how many time have to rotate array a
//		int ans[][] = new int[b.length][a.length];
		int ans[][] = multipleRotations(a, b); 
		
		for(int e[] : ans) {
			printArray(e); 
			System.out.println();
		}
//		rotateByk(a, 3);  
//		printArray(a); 
	}
	static void printArray(int a[]) {
		for(int e : a) {
			System.out.print(e+" ");
		}
	}
	
	static int[][] multipleRotations(int a[], int b[]) {
		int n = a.length;
		int m = b.length;
		int ans[][] = new int[m][n];
		
		//Preprocessing
		int temp[] = new int[2*n];
		for(int i = 0; i<n; i++) {
			temp[i] = a[i];
			temp[i+n] = a[i];
		}
		for(int i = 0; i<m; i++) {
			int offset = (b[i])%n;      //means how many times we have to rotate. by using %n offset will be between 0-n
			for(int j = 0; j<n; j++) {
				ans[i][j] = temp[j + offset];
			}		
		}	
		return ans;	
	} 
	
	
//	static void rotateByk(int a[], int k) {
//		int n = a.length;
//		for(int i = 0; i < k; i++) {
//			int temp = a[0];
//			for(int j = 0; j < n-1; j++) {
//				a[j] = a[j+1];
//			}
//			a[n-1] = temp;
//		}
//	}

}
