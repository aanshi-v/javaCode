package interview;

import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * These are checked at compile-time. The compiler forces you to either:

Handle them with a try-catch block, or

Declare them with throws in the method signature.

🔹 Examples of Checked Exceptions:
IOException

SQLException

FileNotFoundException

ClassNotFoundException
 */
public class CheckedExample {

	public static void main(String[] args) {
		
		try {
            FileReader reader = new FileReader("file.txt"); // may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

	}

}
