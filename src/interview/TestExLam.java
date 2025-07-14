package interview;

import java.io.IOException;

/**
 * Quest: 1.4- Can lambda expressions throw checked exceptions? How do you handle them?
 * 2. Use a Custom Functional Interface That Declares the Exception:
 */

@FunctionalInterface
interface CheckedFunction {
    void apply() throws IOException;
}


public class TestExLam {

	public static void main(String[] args){ 
	
	     CheckedFunction cf = () -> {
	            // Now it's allowed
	            throw new IOException("Checked exception thrown!");
	        };

	        try {
	            cf.apply();
	        } catch (IOException e) {
	            System.out.println("Caught: " + e.getMessage());
	        }
	        
//	        cf.apply();
	}

}
