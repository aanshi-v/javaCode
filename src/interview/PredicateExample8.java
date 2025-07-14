package interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Quest: 10.8 - . Explain a real-world use case where Predicate helped in filtering business rules.
 * 
 * Use Case: Using Predicate to Filter Orders Based on Business Rules
 * The order amount must be greater than ₹500.
 * The customer's account must be active.
 * The product must be in stock.
 * 
 * 
 * Why Use Predicate?
    Reusable: Each rule is isolated and reusable.

    Composable: Combine multiple rules using .and(), .or(), .negate().

    Clear logic: Improves readability and separates logic from filtering.

    Testable: You can write unit tests for each Predicate.
    
    
    Real Use Cases in Industry:
    Filtering users eligible for promotions
    Validating transactions before processing
    Applying loan approval rules in finance
    Access control rules in security systems
 */

public class PredicateExample8 {

	public static void main(String[] args) {
		
		  List<OrderDto> orders = Arrays.asList(
		            new OrderDto(1000, true, true),
		            new OrderDto(200, true, true),
		            new OrderDto(800, false, true),
		            new OrderDto(600, true, false)
		        );
		  
		// Define business rule predicates
	        Predicate<OrderDto> amountCheck = order -> order.amount > 500;
	        Predicate<OrderDto> activeCustomerCheck = order -> order.isCustomerActive;
	        Predicate<OrderDto> stockCheck = order -> order.isProductInStock;

	        // Combine rules using .and()
	        Predicate<OrderDto> validOrderCheck = amountCheck
	                                           .and(activeCustomerCheck)
	                                           .and(stockCheck);

	        // Filter valid orders
	        List<OrderDto> validOrders = orders.stream()
	                                        .filter(validOrderCheck)
	                                        .collect(Collectors.toList());

	        System.out.println("Valid orders for processing:");
	        validOrders.forEach(System.out::println);
	}

}
