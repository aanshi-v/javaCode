package code3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Output:- non-common values: 1, 2, 5, 6
 */
public class NonDuplicateValues {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> nonDuplicates = 
            Stream.concat(list1.stream(), list2.stream())
                  .filter(i -> !(list1.contains(i) && list2.contains(i)))
                  .collect(Collectors.toList());

        System.out.println("Non-duplicate values: " + nonDuplicates);
        
        
//        List<Integer> nonDuplicates2 = 
//                Stream.concat(list1.stream(), list2.stream()).distinct()
//                                            .collect(Collectors.toList());
//        
//        System.out.println("Non-duplicate values 2: " + nonDuplicates2);

	}

}
