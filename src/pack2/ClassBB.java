package pack2;

import java.util.Scanner;

public class ClassBB 
{
	static Scanner sc=new Scanner(System.in);
	void meth1() 
	{
		System.out.println("Enter EmpName :");
		String ename=sc.nextLine();
		System.out.println("\nEnter EmpId :");
		String eid=sc.nextLine();
		System.out.println("\nEnter EmpSal :");
//		double esal=sc.nextDouble();
		double esal=Double.parseDouble(sc.nextLine());
		System.out.println("\nEnter EmpAddress :");
//		sc.nextLine();
		String eadd=sc.nextLine();
		
		System.out.println("\nDetails Entered by the user \n");
		System.out.println("EmpName :"+ename+"\nEmpiD :"+eid+"\nEmpSal :"+esal+"\nEmpAddress :"+eadd);
	}
	public static void main(String[] args) 
	{
		ClassBB aobj = new ClassBB();
		aobj.meth1();
	}
}
