package code;

import java.util.ArrayList;
import java.util.List;

public class SalaryUpdater {

	public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 25000));
        employees.add(new Employee("Bob", 30000));
        employees.add(new Employee("Charlie", 35000));
        employees.add(new Employee("Diana", 29000));

        System.out.println("Before Salary Update:");
        employees.forEach(System.out::println);

        // Increase salary by 10% for employees earning 30k or less
        employees.stream()
                .filter(emp -> emp.getSalary() <= 30000)
                .forEach(emp -> emp.increaseSalary(10));

        System.out.println("\nAfter Salary Update:");
        employees.forEach(System.out::println);
    }
}
