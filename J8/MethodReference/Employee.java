package MethodReference;

public class Employee {
	public void work() {
		System.out.println("Employee Is Working");
	}

	public static void salary() {
		System.out.println("Employee is working for salary");
	}
	public static void salary(double salary) {
		System.out.println("Employee salary is : "+salary);
	}
}
