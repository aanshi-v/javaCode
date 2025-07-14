package Exception;

public class TestException {
	public static void main(String[] args) {	
		try {
			 validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("Caught custom exception: " + e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException{ 
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}	
	}
}
