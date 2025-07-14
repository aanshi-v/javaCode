package interview;

import java.util.function.Function;


/**
 * Quest: 2.6 - How do functional interfaces enable higher-order functions? 
 * You can pass a functional interface (like Function, Predicate, etc.) to a method. This is how you pass a function as an argument.   
 * Here, operate is a higher-order function because it takes a function (Function<Integer, Integer>) as a parameter.
 */
public class HigherOrderFunctions { 
	
	// Higher-order function: takes a function as argument
    public static int operate(int x, Function<Integer, Integer> func) {
        return func.apply(x);
    }

    public static void main(String[] args) {
        int result = operate(5, n -> n * n);  // Passes a lambda
        System.out.println(result); // Output: 25
    }
 
}
