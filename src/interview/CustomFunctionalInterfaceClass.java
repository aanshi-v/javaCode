package interview;


//Quest:2.5- Create a custom functional interface that takes two inputs and returns a boolean.


public class CustomFunctionalInterfaceClass {
	
	@FunctionalInterface
	public interface CustomFunctionalInterface<T, U> {
	    boolean test(T t, U u);
	}

	public static void main(String[] args) {
		
		CustomFunctionalInterface<String, String> isEqual = (a, b) -> a.equalsIgnoreCase(b);

	        System.out.println(isEqual.test("Hello", "hello")); // true
	        System.out.println(isEqual.test("Java", "Python")); // false
		
	} 

}
