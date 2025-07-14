package interview;

import java.util.function.Supplier;

/**
 * Quest:10.7 - How do you implement retry logic using Supplier and lambdas?
 * 
 * You use retry logic when an operation (like a network request or file read) might fail temporarily, 
 * and retrying could succeed.
 * 
 */
public class RetryWithSupplier {

	public static void main(String[] args) {
		
		// Create a retryable supplier
        String result = retry(() -> riskyOperation(), 3);
        System.out.println("Final result: " + result);
	}

	// Retry logic
    public static <T> T retry(Supplier<T> supplier, int maxAttempts) {
        int attempt = 0;
        while (true) {
            try {
                return supplier.get(); // try the operation
            } catch (Exception e) {
                attempt++;
                System.out.println("Attempt " + attempt + " failed: " + e.getMessage());
                if (attempt >= maxAttempts) {
                    throw new RuntimeException("Operation failed after " + maxAttempts + " attempts", e);
                }
            }
        }
    }

    // Simulated risky operation
    public static String riskyOperation() {
        if (Math.random() < 0.7) {
            throw new RuntimeException("Temporary failure");
        }
        return "Success!";
    }
}
