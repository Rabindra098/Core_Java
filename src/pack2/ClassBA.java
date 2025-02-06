package pack2;

import java.util.Scanner;

public class ClassBA 
{
	static Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println("Enter your 1st number");
		int x=sc.nextInt();
		System.out.println("User entered x :"+x);
		System.out.println("Enter your 2st number");
		int y=sc.nextInt();
		System.out.println("User entered y :"+y);
		int z=x+y;
		System.out.println("\nz value :"+z);
	}
	String meth2(int i)
	{
		System.out.println("\nmeth2() called\n");
		if (i%2==0) 
		{
			System.out.println("if block executed");
			System.out.println("Condition satisfied please give your feed back");
			return sc.nextLine();
		}
		else 
		{
			System.out.println("else block executed");
			System.out.println("Condition is not satisfied please give your feed back");
			return sc.nextLine();
		}
	}
	void meth3(String name,String gender)
	{
		System.out.println("meth3() called");
		switch (gender) 
		{
		case "Female":
			System.out.println(name+" you are elligible for maternity leave");
			break;
		case "male":
			System.out.println(name+" you are elligible for paternity leave");
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
	
	public static void main(String[] args) 
	{
		ClassBA aobj = new ClassBA();
//		aobj.meth1();
		System.out.println("==> user given the fead back '"+aobj.meth2(2)+"'");
//		System.out.println("What is your name?");
//		String Uname=sc.next();
//		System.out.println("What is your Gender?");
//		String Ugender=sc.next();
//		aobj.meth3(Uname, Ugender);
	}
}
