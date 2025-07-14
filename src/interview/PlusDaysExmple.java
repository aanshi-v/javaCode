package interview;

import java.time.LocalDate;

public class PlusDaysExmple {

	public static void main(String[] args) {
		
		 LocalDate today = LocalDate.of(2025, 5, 16); // Friday
	        LocalDate tomorrow = today.plusDays(1);      // Adds 1 day

	        System.out.println("Today: " + today);
	        System.out.println("Tomorrow: " + tomorrow);

	}

}
