package pack5;

public class Employee_1st_Class 
{
	private String empName;
	private int empSal;
	private String empDept;
	public Employee_1st_Class (String empName,int empSal,String empDept)
	{
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	@Override
	public String toString() 
	{
		return empName;
	}
	public String getString() 
	{
		return empName;
	}
}
