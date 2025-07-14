package code3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort {

	public static void main(String[] args) {
		int[] a1 = {19, 1, 15, 7, 3};
		int[] a2 = {3, 4, 1, 8, 6};
		
		int[] result = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).distinct().sorted().toArray();
		
		System.out.println("result: " + Arrays.toString(result)); 
		
		
		
		int[] result2 = Arrays.stream(a1).filter(e -> String.valueOf(e).startsWith("1")).toArray();
		
		System.out.println("Result2 : " + Arrays.toString(result2));  

	}

}
