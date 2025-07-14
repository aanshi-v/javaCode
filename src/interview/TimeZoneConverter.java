package interview;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Quest:5.10- Write a function that accepts a time in one timezone and converts it to another.
 * 
 * Kolkata, West Bengal is 9 hours and 30 minutes ahead of New York, NY, USA
 */
public class TimeZoneConverter {

	public static void main(String[] args) {
		
		String inputTime = "2025-05-17 14:30"; // Time in fromZone
        String fromZone = "Asia/Kolkata";
        String toZone = "America/New_York";

        String result = convertTimeZone(inputTime, fromZone, toZone);
        System.out.println("Converted Time: " + result);

	}

	private static String convertTimeZone(String dateTimeStr, String fromZone, String toZone) {
		
		// Define input and output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Parse the input time
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);

        // Attach source time zone
        ZonedDateTime fromZonedDateTime = localDateTime.atZone(ZoneId.of(fromZone));

        // Convert to destination time zone
        ZonedDateTime toZonedDateTime = fromZonedDateTime.withZoneSameInstant(ZoneId.of(toZone));

        // Format and return the result
        return toZonedDateTime.format(formatter);
	}

} 
