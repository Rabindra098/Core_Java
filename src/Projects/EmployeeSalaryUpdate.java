package Projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
  Let us consider we have a list of employees ,where each employee has attributes like age, name and salary
  WAP to increase the salary of each employee whose age is greater than 25 by 10% and print the updated employee
  details in a sorting order (consider salary) using stream API 
 */

public class EmployeeSalaryUpdate 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Rabindra", 22, 75000.56));
		al.add(new Employee("Kamal", 27, 85000.46));
		al.add(new Employee("Aman", 26, 55000.87));
		al.add(new Employee("Rajib", 30, 98000.06));
		al.add(new Employee("Rohan", 28, 69000.37));
		al.add(new Employee("Himansu", 24, 40000.94));
		List<Employee> s=al.stream().peek
				(emp->
				{
					if (emp.empAge>25) 
					{
						emp.increaseSalary(10);
					}
				})
				.sorted(Comparator.comparingDouble(emp->emp.empSal))
				.collect(Collectors.toList())
				;
		s.forEach(System.out::println);
	}
}
