package interview;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Quest:5.6-  How do you format and parse dates using DateTimeFormatter?
 */
public class FormatParseDateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2025, 5, 17);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = date.format(formatter);

        System.out.println("Formatted date: " + formattedDate);

//___________________________________________________________________________
        
        String dateString = "17-05-2025";

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date2 = LocalDate.parse(dateString, formatter2);
        System.out.println("Parsed date: " + date2);
        
        // Format it back to DMY string
        String formatted = date2.format(formatter2);
        System.out.println("Parsed date: " + formatted); // Will print in dd-MM-yyyy format
	}

}
