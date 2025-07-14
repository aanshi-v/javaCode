package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Question:7.3 - How do you group by count elements using a stream? 
 */
public class GroupCountExample {

	public static void main(String[] args) {
		
		  List<Person> people = Arrays.asList(
		            new Person("Alice", "Delhi"),
		            new Person("Bob", "Mumbai"),
		            new Person("Charlie", "Delhi"),
		            new Person("David", "Mumbai"),
		            new Person("Eva", "Bangalore")
		        );

		        Map<String, Long> countByCity = people.stream()
		            .collect(Collectors.groupingBy(
		                Person::getCity,
		                Collectors.counting()
		            ));

		        System.out.println(countByCity);
	}

}


class Person {
    String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
