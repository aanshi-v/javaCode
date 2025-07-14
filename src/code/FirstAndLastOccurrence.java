package code;

//Write logic for finding the index of the first as well as the last occurrence of an element in the array using linear time without using any extra space. Consider one indexing 
public class FirstAndLastOccurrence {

	public static void main(String[] args) {
		int[] arr = {5, 7, 8, 7, 3, 7, 2, 7};  // Example array
        int target = 7;  // Element whose first and last occurrence to find

        findFirstAndLast(arr, target);
	}
	
	
	public static void findFirstAndLast(int[] arr, int target) {
        int firstIndex = -1;  // Initialize firstIndex to -1
        int lastIndex = -1;   // Initialize lastIndex to -1

        // Traverse the array once
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;  // 1-based index for the first occurrence
                }
                lastIndex = i;  // Always update lastIndex (1-based)
            }
        }

        if (firstIndex == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        }
    }

}
