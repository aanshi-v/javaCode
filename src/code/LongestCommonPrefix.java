package code;

/**
 * find the longest common prefix string amongst an array of strings.
   If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] arr = {"flower", "flow", "flight"};
		System.out.println("Common Prefix is: " + findPrefix(arr));

	}

	private static String findPrefix(String[] arr) { 
		if(arr == null || arr.length == 0) {
			return "";
		}
		
		String prefix = arr[0];       //flower
		for(int i = 1; i < arr.length; i++) {
			while(arr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

}
