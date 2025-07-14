package code;

/**
 * add two string using lambda expression
 */
public class LambdaStringAdder {

	public static void main(String[] args) {
		
		LambdaStringAdderInterface obj = (s1, s2) -> s1 + s2;
		String result = obj.add("Aanshi ", "Vishwakarma"); 
		System.out.println("Result is: " + result);
	}

}
