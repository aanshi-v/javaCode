package interview;

@FunctionalInterface
interface Adder {
    int add(int a, int b);  // One abstract method
}

public class FunctionalInterfaceExam {

	public static void main(String[] args) {
		
		 Adder adder = (a, b) -> a + b;  // Lambda expression

	        int result = adder.add(10, 20);
	        System.out.println("Sum: " + result);
		
	}
 
}
