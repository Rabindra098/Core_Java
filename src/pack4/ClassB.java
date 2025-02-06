package pack4;
import java.util.Scanner;

public class ClassB 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);	
		ClassA aobj = new ClassA();
		
		System.out.print("Enter your name :");
	//	aobj.empName=sc.next();
		aobj.setEmpName(sc.next());
		
		System.out.print("\nEnter your Salary :");
	//	aobj.empSal=sc.nextInt();
		aobj.setEmpSal(sc.nextInt());
		
		System.out.print("\nEnter your Dept name :");
	//	aobj.empDept=sc.next();
		aobj.setEmpDept(sc.next());
		
		System.out.println("\nEmployee details ");
		System.out.print("Employee Name is :"+aobj.getEmpName());
		System.out.print("\nEmployee Salary is :"+aobj.getEmpSal());
		System.out.print("\nEmployee DeptName is :"+aobj.getEmpDept());
	}
	public static void main(String[] args) 
	{
		ClassB bobj = new ClassB();
		bobj.meth1();
	}
}
