package interview;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Quest:8.3 - Difference between Class::staticMethod and instance: instanceMethod references.
 */
public class StaticInstance {
	
	 public static int multiply(int a, int b) {
	        return a * b;
	    }
//_____________________________________________________________________________
	 
	 public void print(String msg) {
	        System.out.println("Message: " + msg);
	    }
//_____________________________________________________________________________
	 
	public static void main(String[] args) {
		/* 1. ClassName::staticMethod 
		 *  Refers to a static method in a class.
		 *  When you want to call a static utility method.
		 *  No object instance is required.
		 */	
		BiFunction<Integer, Integer, Integer> mul = StaticInstance::multiply;
        System.out.println(mul.apply(3, 4));  // Output: 12
		     
   //___________________________________________________________________________
        
	/* 2. instance::instanceMethod 
	 *  Refers to a non-static method on a specific object instance.
	 *  When you already have an object and want to call one of its instance methods.
	 *  Useful in callbacks, event handling, or Stream operations.
	 */
        StaticInstance printer = new StaticInstance();

        Consumer<String> messagePrinter = printer::print;
        messagePrinter.accept("Hello Java!");  // Output: Message: Hello Java!
	//___________________________________________________________________________
	}

}
