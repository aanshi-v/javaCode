package interview;

import java.util.function.Function;

/**
 * Question:10.3-  How do you combine multiple Functions using andThen and compose?
 * 
 * In Java 8, you can combine multiple Function instances using the methods:

       andThen(Function after) → applies this function first, then the after function.

       compose(Function before) → applies the before function first, then this function.
 */
public class FunctionChainingExample {

	public static void main(String[] args) {
		
		// Define two simple functions
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        // andThen: multiply first, then add
        Function<Integer, Integer> multiplyThenAdd = multiplyBy2.andThen(add10);
        System.out.println("andThen result: " + multiplyThenAdd.apply(5));  // (5 * 2) + 10 = 20

        // compose: add first, then multiply
        Function<Integer, Integer> addThenMultiply = multiplyBy2.compose(add10);
        System.out.println("compose result: " + addThenMultiply.apply(5));  // (5 + 10) * 2 = 30

	}

}
