package interview;

import java.util.function.Consumer;

/**
 * Question:10.5 - Write a reusable Consumer that logs data. 
 */
public class LoggingConsumerExample {

	public static void main(String[] args) {
		
		  // Reusable Consumer that logs any type of data
        Consumer<Object> logConsumer = data -> System.out.println("LOG: " + data);

        // Using the logging consumer with different types of data
        logConsumer.accept("Hello, world!");
        logConsumer.accept(123);
        logConsumer.accept(new RuntimeException("Sample exception"));

	}

}
