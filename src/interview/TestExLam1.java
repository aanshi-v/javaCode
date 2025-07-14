package interview;

import java.io.IOException;

/**
 * Quest: 1.4- Can lambda expressions throw checked exceptions? How do you handle them?
 * 1. Handle the Exception Inside the Lambda:
 */
public class TestExLam1 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
		    try {
		        throw new IOException("Error!");
		    } catch (IOException e) {
		        System.out.println("Handled: " + e.getMessage());
		    }
			
//			 throw new IOException(); // ❌ Compilation error: IOException is checked
		};
		r.run(); 

	}

}
