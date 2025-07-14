package interview2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;


/**
 * split(" ") splits into: ["this", "is", "a", "sampleZXXX", "string"]

filter(word -> word.contains("ZXXX")) keeps "sampleZXXX"

.map(word -> "ZXXX") converts it to "ZXXX"

.findFirst() picks the first match

.orElse("Not found") gives fallback if not found

 */
public class RetrieveWordFromString {

	public static void main(String[] args) {
		
		String text = "this is a sampleZXXX string";
		
		String result = Arrays.stream(text.split(" "))
//                .filter("ZXXX"::equals)
				.filter(word -> word.contains("ZXXX"))           // match words that contain "ZXXX"
				.map(word -> "ZXXX")                   // return just "ZXXX"
                .findFirst()
                .orElse("Not found"); 

        System.out.println(result); 
        
        
//        String text = "sampleZXXX";
//
//        String result = Stream.of(text)
//                              .filter(s -> s.contains("ZXXX"))
//                              .map(s -> "ZXXX")
//                              .findFirst()
//                              .orElse("Not found");
//
//        System.out.println(result); 
        
        
        

	}

}
