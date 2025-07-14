package code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer functional interface and lambda expression to store elements in a list.
 */
public class LambdaListStorage {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Consumer<Integer> consumer = element -> list.add(element);
		consumer.accept(24);
		consumer.accept(7);
		consumer.accept(19);
		
		System.out.println(list); 
	}
}
