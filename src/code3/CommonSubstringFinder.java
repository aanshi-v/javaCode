package code3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Java 8 program to find names containing common substrings using streams and functional programming
 */
public class CommonSubstringFinder {

	public static void main(String[] args) {
//		String[] name = {"Nitin", "Jaitin", "Rohan"};
		String[] name2 = {"NiTiN", "JAitIn", "ROHan"};
			
		String commonStr = "tin";
		
//		List<String> result = Arrays.stream(name).filter(e -> e.contains(commonStr)).collect(Collectors.toList());
//		System.out.println("Result : " + result); 	
		
		List<String> result2 = Arrays.stream(name2).map(e -> e.toLowerCase()).filter(e -> e.contains(commonStr)).collect(Collectors.toList());          
		System.out.println("Resilt2 : " + result2);
	}
}

