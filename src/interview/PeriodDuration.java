package interview;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Quest:5.5- What is Period and Duration? When do you use them?
 * Quest:5.7- How do you find the difference between two dates in days or months? 
 * 
 * 1. Period — Date-based Amount of Time
Represents a quantity of time in years, months, and days

Works with LocalDate (which doesn't have time-of-day)

📌 Use When:
You are dealing with dates, e.g., age calculation, project deadline in months, etc.
___________________________________________________________

 2. Duration — Time-based Amount of Time
Represents a quantity of time in hours, minutes, seconds, nanoseconds

Works with LocalTime, LocalDateTime, or Instant (which include time)

📌 Use When:
You are measuring time duration, like how long a task took, session timeout, stopwatch, etc.

 */
public class PeriodDuration {

	public static void main(String[] args) {
		//Period.between() — for exact Years, Months, and Days separately
		LocalDate startDate = LocalDate.of(2020, 1, 1);
		LocalDate endDate = LocalDate.of(2025, 5, 17);

		Period period = Period.between(startDate, endDate);
		
//		System.out.println("period:" + period); 

		System.out.println("Years: " + period.getYears());
		System.out.println("Months: " + period.getMonths());
		System.out.println("Days: " + period.getDays());
//___________________________________________________________________
		
		LocalTime start = LocalTime.of(9, 30);
		LocalTime end = LocalTime.of(13, 15);

		Duration duration = Duration.between(start, end);

//		System.out.println("duration :" + duration); 
		System.out.println("\nHours: " + duration.toHours()); 
		System.out.println("Minutes: " + duration.toMinutes());
		
//____________________________________________________________________
		
		//ChronoUnit.DAYS.between() — for total days, months, years
		
		LocalDate startD = LocalDate.of(2024, 12, 1);
        LocalDate endD = LocalDate.of(2025, 5, 17);

        long TotalDays = ChronoUnit.DAYS.between(startD, endD);
        long months = ChronoUnit.MONTHS.between(startD, endD);
        long years = ChronoUnit.YEARS.between(startD, endD);

        System.out.println("\n");
        System.out.println("TotalDays: " + TotalDays);
        System.out.println("Months: " + months);
        System.out.println("Years: " + years);
	} 

}
