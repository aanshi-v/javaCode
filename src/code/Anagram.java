package code;

import java.util.Arrays;

/**
 * Check whether two Strings are anagram of each other
 For example, “abcd” and “dabc” are an anagram of each other.
 */
public class Anagram {
	
	static boolean areAnagram(char[] arr1, char[] arr2) {
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		if(l1 != l2) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("After shorting arr1:  "+ Arrays.toString(arr1));
		System.out.println("After shorting arr2:  "+ Arrays.toString(arr2));
		
		for(int i= 0; i < l1; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
//		System.out.println(str1.length());
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
//		for(char c : arr1) {
//			System.out.print(c + " ");
//		}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		
		if(areAnagram(arr1, arr2)) {
			System.out.println("Strings are anagram of each other");
		}else {
			System.out.println("no anagram"); 
		}		

	}

}
