package Projects;

public class Employee 
{
	String empName;
	int empAge;
	double empSal;
	public Employee(String empName, int empAge, double empSal)
	{
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
	}
	public void increaseSalary(double percentage) 
	{
	    this.empSal += this.empSal * (percentage / 100);
	}
	@Override
	public String toString() 
	{
		return "Employee Name = " + empName + ", Employee Age =" + empAge + ", Employee Sal =" + empSal+"\n";
	}
}
