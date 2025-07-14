package interview;

/**
 * These are not checked at compile-time. They occur at runtime and are a subclass of RuntimeException.

You don’t need to handle them, but you can if you want.

🔹 Examples of Unchecked Exceptions:
NullPointerException

ArithmeticException

ArrayIndexOutOfBoundsException

IllegalArgumentException
 */
public class UncheckedExample {

	public static void main(String[] args) {
	
		int a = 10 / 0; // throws ArithmeticException at runtime

	}

}
