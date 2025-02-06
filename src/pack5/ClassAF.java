package pack5;

public class ClassAF 
{
	String empName;
	int empSal;
	String empDept;
	public ClassAF(String empName,int empSal,String empDept) 
	{
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empName+" "+empDept;
	}
}
