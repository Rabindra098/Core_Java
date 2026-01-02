package Problems;

import java.util.ArrayList;

public class EmployeeSorter {
    public static <T> void main(String[] args) {
    	ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(101, "John", 75000.0));
        employees.add(new Employee(102, "Alice", 85000.0));
        employees.add(new Employee(103, "Bob", 75000.0));
        employees.add(new Employee(104, "Charlie", 90000.0));

        System.out.println("Before sorting:");
        for (Employee e : employees) 
        {
            System.out.println(e);
        }
        employees.sort(new EmployeeComparator());
        System.out.println("\nAfter sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
