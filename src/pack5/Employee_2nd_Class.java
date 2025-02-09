package pack5;

public class Employee_2nd_Class implements Comparable<Employee_2nd_Class>
{
	private String empName;
	private int empSal;
	private String empDept;
	
	public Employee_2nd_Class(String empName, int empSal, String empDept) 
	{
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	public String toString() 
	{
		return empName+" "+empSal+" "+empDept;
	}
	@Override
	public int compareTo(Employee_2nd_Class o) 
	{
		return this.empSal-o.empSal;
//		return this.empName.compareTo(o.empName);
//		return this.empDept.compareTo(o.empDept);
	}
	
}
