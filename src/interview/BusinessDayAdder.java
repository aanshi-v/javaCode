package interview;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Quest:5.4- How to add 5 business days to a given LocalDate using Java 8?
 */
public class BusinessDayAdder {

	public static void main(String[] args) {
		
		 LocalDate today = LocalDate.of(2025, 5, 16); // Example: Friday
	        LocalDate futureDate = addBusinessDays(today, 5);
	        System.out.println("Future business date: " + futureDate);
	}
 
	private static LocalDate addBusinessDays(LocalDate startDate, int businessDays) {
		 LocalDate result = startDate;
	        int addedDays = 0;

	        while (addedDays < businessDays) {
	            result = result.plusDays(1);
	            if (!(result.getDayOfWeek() == DayOfWeek.SATURDAY ||
	                  result.getDayOfWeek() == DayOfWeek.SUNDAY)) {
	                addedDays++;
	            }
	        }

	        return result;
	}

}
