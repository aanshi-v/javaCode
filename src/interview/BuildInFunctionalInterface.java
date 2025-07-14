package interview;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.*;

/**
 * 
 Interface	              Description	                 Method Name
Predicate<T>     	   Takes T, returns boolean	              test()
Consumer<T>	           Takes T, returns void	             accept()
Supplier<T>	           Takes nothing, returns T	                get()
Function<T, R>	       Takes T, returns R	                    apply()
BiFunction<T, U, R> 	Takes T, U, returns R	              apply()
UnaryOperator<T>	   Takes and returns same type (T)	      apply()
BinaryOperator<T>	   Takes two T, returns one T	          apply()
Runnable	           Takes nothing, returns nothing	        run()
 */
public class BuildInFunctionalInterface {

	public static void main(String[] args) {
		
//1. Predicate<T>
//		Represents a boolean-valued function of one argument.
		
		Predicate<String> isEmpty = str -> str.isEmpty();
		System.out.println(isEmpty.test(""));       // true
		System.out.println(isEmpty.test("Hello"));  // false
		
		
//_______2. Consumer<T>__________________________________________________________
//Represents an operation that accepts a single input and returns no result.
		Consumer<String> printer = s -> System.out.println(s);
		printer.accept("Hello, world!");  // Output: Hello, world!
		
		
//_______ 3. Supplier<T>__________________________________________________________		
//Represents a supplier of results — takes no arguments, returns a result.
		
		Supplier<Double> randomGenerator = () -> Math.random();
		System.out.println(randomGenerator.get());  // Example output: 0.7353
		
		
//________4. Function<T, R>__________________________________________________________		
//Represents a function that takes one argument and returns a result.
		
		Function<String, Integer> lengthFunction = s -> s.length();
		System.out.println(lengthFunction.apply("Java"));  // Output: 4
	
		
//_________ 5. BiFunction<T, U, R>___________________________________________________		
//Represents a function that takes two arguments and returns a result.
		
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(5, 3));  // Output: 8

		
//__________6. UnaryOperator<T>______________________________________________________________		
//A specialization of Function<T, T> for operations on the same type.
		
		UnaryOperator<String> toUpper = s -> s.toUpperCase();
		System.out.println(toUpper.apply("hello"));  // Output: HELLO

		
//__________ 7. BinaryOperator<T>_______________________________________________________		
//A specialization of BiFunction<T, T, T> for the same type of inputs and output.
		
		BinaryOperator<Integer> multiply = (a, b) -> a * b;
		System.out.println(multiply.apply(3, 4));  // Output: 12
		
		
//Runnable is a functional interface in Java used to represent a task that can be executed concurrently or in a separate thread.
//It is part of the java.lang package and has just one abstract method:
		Runnable task = () -> System.out.println("Task is running...");
        Thread thread = new Thread(task);
        thread.start();  // Output: Task is running...
		
	}

}
