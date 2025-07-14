package code;

import java.util.Arrays;
import java.util.Collections;

public class Print2largestNo {

	public static void main(String[] args) {
		
//		int[] arr =  {12, 35, 1, 10, 34, 1};
		Integer[] arr =  {12, 35, 1, 10, 34, 1};
		int len = arr.length;
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < len; i++) {
//			if(arr[i] != arr[0])
			System.out.println(arr[i]); 
		}
		
		if(arr[1] != arr[0]) {
			System.out.println("2nd Largest no: "+ arr[1]); 
		}
		
		if(arr[1] != arr[0] && arr[2] != arr[0]) {
			System.out.println("3nd Largest no: "+ arr[2]); 
		}

	}

}
