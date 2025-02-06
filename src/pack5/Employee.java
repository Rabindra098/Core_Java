package pack5;

public class Employee 
{
	private String empName;
	private int empSal;
	private String empDept;
	public Employee (String empName,int empSal,String empDept)
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
