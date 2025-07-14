package interview;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Quest:5.3- How do you convert legacy Date (java.util.Date) to LocalDateTime and vice versa?
 */
public class DateTimeConversion {

	public static void main(String[] args) {
		
		/*
		 * Convert Date → LocalDateTime 
		 * You need a ZoneId to convert because Date has no time zone info.
		 * 
		 * date.toInstant() gets the timestamp (Instant)

           .atZone() converts it to a specific time zone

            .toLocalDateTime() gets rid of the zone, giving just date+time
		 */
		
		Date date = new Date();  // current date and time

		LocalDateTime localDateTime = date.toInstant()
		    .atZone(ZoneId.systemDefault())
		    .toLocalDateTime();

		System.out.println("LocalDateTime: " + localDateTime);
		
//_____________________________________________________________________________
		
		/* Convert LocalDateTime → Date 
		 * You must supply a time zone to convert LocalDateTime into a Date.
		 * 
		 * LocalDateTime.now()	                            Get current date and time (no time zone)
           .atZone(ZoneId.systemDefault())	                Attach time zone
           .toInstant()	                                    Convert to an Instant (UTC)
            Date.from()	                                    Convert Instant to old Date object
		 */
		
		LocalDateTime localDateTime2 = LocalDateTime.now();

		Date date2 = Date.from(
		    localDateTime2.atZone(ZoneId.systemDefault()).toInstant()
		);

		System.out.println("Date2: " + date2);
		

	} 

}
