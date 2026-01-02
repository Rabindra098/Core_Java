package Java8;

import java.util.Optional;

public class OptionalDemo2 {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Rabi");
//		Employee emp = new Employee();
		Optional<Integer> empId = emp.getEmpId();
		if (empId.isPresent()) {
			System.out.println(empId.get());
		} else {
			System.err.println("No id value ");
		}
		Optional<String> empName = emp.getEmpName();
		String name = empName.orElse("name is not available");
		System.out.println(name);
	}
}
