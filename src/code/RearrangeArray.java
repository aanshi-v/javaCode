package code;

/**
 * For the array: [1, -2, 3, -4, 5, -6]

Initially, arr = [1, -2, 3, -4, 5, -6] and j = 0.
Iteration 1 (i = 0): arr[0] = 1 (positive), no action.
Iteration 2 (i = 1): arr[1] = -2 (negative), swap arr[1] with arr[0], arr = [-2, 1, 3, -4, 5, -6], increment j = 1.
Iteration 3 (i = 2): arr[2] = 3 (positive), no action.
Iteration 4 (i = 3): arr[3] = -4 (negative), swap arr[3] with arr[1], arr = [-2, -4, 3, 1, 5, -6], increment j = 2.
Iteration 5 (i = 4): arr[4] = 5 (positive), no action.
Iteration 6 (i = 5): arr[5] = -6 (negative), swap arr[5] with arr[2], arr = [-2, -4, -6, 1, 5, 3], increment j = 3.

O(n), where n is the size of the array, as we only traverse the array once.
Space Complexity: O(1) because we only use two pointers and no extra space.
 */
public class RearrangeArray {
	
	 public static void main(String[] args) {
	        int[] arr = {1, -2, 3, -4, 5, -6};
	        System.out.println("Original Array:");
	        printArray(arr);

	        rearrange(arr);

	        System.out.println("Rearranged Array:");
	        printArray(arr);
	    }
	 
	 public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	public static void rearrange(int[] arr) {
        int j = 0; // Pointer for placing negative numbers
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap negative number with arr[j] and increment j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    
  
}
