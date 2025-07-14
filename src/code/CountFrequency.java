package code;

//Given an array which may contain duplicates, print all elements and their frequencies
public class CountFrequency {

	public static void main(String[] args) {
		int[] a = {3, 7, 1, 9, 3, 3, 7, 6, 6};
		
		for(int i = 0; i < a.length; i++) {
			int x = a[i];
			int count = 0;
				
			if(x == -1) 
				continue;
			
			for(int j = 0; j < a.length; j++) {
				if(a[j] == x) {
					count++;
					a[j] = -1;
				}
			}
			System.out.println(" Frequency of " + x + " is " + count);
		}	
	}
}
