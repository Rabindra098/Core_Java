package pack5;

public class Employee_3rd_Class 
{
	private String empName;
	private int empSal;
	private String empDept;
	
	public Employee_3rd_Class(String empName, int empSal, String empDept) 
	{
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public int getEmpSal() 
	{
		return empSal;
	}
	public String getEmpDept() 
	{
		return empDept;
	}
	public String toString() 
	{
		return empName+" "+empSal+" "+empDept;
	}
}
