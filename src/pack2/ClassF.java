package pack2;

public class ClassF 
{
	String empName;
	int empSal;
	String empDept;
	static String empCompany="TCS";
	public ClassF(String name,int sal,String dept) 
	{
		empName=name;
		empSal=sal;
		empDept=dept;
	}
	public static void main(String[] args) 
	{
		ClassF emp1 = new ClassF("John",10000,"Java");
		ClassF emp2 = new ClassF("Winston",40000,"Aws");
		ClassF emp3 = new ClassF("athena",60000,"Spring");
		System.out.println("emp1 Details :"+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+emp1.empCompany);
		System.out.println("emp2 Details :"+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+emp2.empCompany);
		System.out.println("emp3 Details :"+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+emp3.empCompany);
		emp1.empSal=95000;
		emp1.empCompany="HCL";
		System.out.println("emp1 Details :"+emp1.empName+" "+emp1.empSal+" "+emp1.empDept+" "+ClassF.empCompany);
		System.out.println("emp2 Details :"+emp2.empName+" "+emp2.empSal+" "+emp2.empDept+" "+ClassF.empCompany);
		System.out.println("emp3 Details :"+emp3.empName+" "+emp3.empSal+" "+emp3.empDept+" "+ClassF.empCompany);
	}
}
