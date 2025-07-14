package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		
	        List<Stream> employees = Arrays.asList(
	            new Stream(1, "Alice"),
	            new Stream(2, "Bob"),
	            new Stream(3, "Charlie"),
	            new Stream(4, "David"),
	            new Stream(5, "Eve"),
	            new Stream(6, "Frank")
	        );
	        
//	        Collections.sort(employees, Collections.reverseOrder());
	        
	        List<Stream> evenIdEmployees = employees.stream()
	            .filter(e -> e.getId() % 2 == 0)
//	            .sorted(Comparator.comparingInt(Stream::getId).reversed())
	            .collect(Collectors.toList());

	        evenIdEmployees.forEach(System.out::println);
	    }

	}

