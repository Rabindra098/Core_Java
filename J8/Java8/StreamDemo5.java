package Java8;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo5 {
	public static class Employee {
		private Integer eid;
		private String ename;
		private Integer eage;
		private Double esal;

		public Employee(Integer eid, String ename, Integer eage, Double esal) {
			this.eid = eid;
			this.ename = ename;
			this.eage = eage;
			this.esal = esal;
		}

		public Integer getEid() {
			return eid;
		}

		public void setEid(Integer eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Integer getEage() {
			return eage;
		}

		public void setEage(Integer eage) {
			this.eage = eage;
		}

		public Double getEsal() {
			return esal;
		}

		public void setEsal(Double esal) {
			this.esal = esal;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + "]";
		}

	}

	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(101, "Rabi", 22, 78790D));
		listOfEmp.add(new Employee(102, "Lopa", 21, 42490D));
		listOfEmp.add(new Employee(103, "Naman", 25, 54890D));
		listOfEmp.add(new Employee(104, "Kamal", 23, 34790D));
		listOfEmp.add(new Employee(105, "Rajib", 24, 84890D));
		System.out.println("Name of the Employee whose salary is > 50K");
		listOfEmp.stream()
					.filter(emp -> emp.getEsal() >= 50000 && emp.getEage() > 22)
					.peek(emp -> emp.setEsal(emp.getEsal() + 5000))
					.forEach(System.out::println);
	}

}
