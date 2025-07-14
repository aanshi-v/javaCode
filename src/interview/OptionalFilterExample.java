package interview;

import java.util.Optional;

/**
 * Quest:4.9-  Explain Optional, filter() with a practical example.
 * 
 * Let’s say we have a UserDto object, and we want to check if a user is an adult (age ≥ 18), only if the user is present.
 */
public class OptionalFilterExample { 

	public static void main(String[] args) {
		
		UserDto user = new UserDto(2, "Alice", 20);
        
        Optional<UserDto> optionalUser = Optional.of(user);

        optionalUser
            .filter(u -> u.getAge() >= 18)
            .ifPresentOrElse(
                u -> System.out.println(u.getName() + " is an adult."),
                () -> System.out.println("User is not an adult or not present.")
            );
	}
 
}
