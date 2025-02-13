//Exception Handling
package pack5;

import java.io.FileReader;
import java.util.Scanner;

public class Exception_Handling_Class 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println(10);
		String name[]=new String[5];
		name[1]="Rabi";
		name[3]="Rabindra";
		try 
		{
			System.out.println("try block executed");
			System.out.println("Enter an any number : ");
			System.out.println("==>"+20/sc.nextInt());
			System.out.println(name[2].length());
			System.out.println(name[3].length());
			System.out.println("Hello");
		} 
		//System.out.println("hyy");	//C.E
//		catch (/*Throwable Exception*/ ArithmeticException e) 
//		{
//			System.out.println("1st-catch block executed");
//			//System.out.println(e.toString());	//Name & reason of the Exception
//			System.out.println(e.getMessage());	//Reason of the Exception
//			e.printStackTrace();	//It provides the complete info releated to the exception 
//		}
//		catch (NullPointerException e) 
//		{
//			System.out.println("2nd-catch block executed");
//			e.printStackTrace();
//		}
		catch (ArithmeticException | NullPointerException e) 
		{
			System.out.println("Catch block executed");
			e.printStackTrace();
		}
		//System.out.println("hello");	//C.E
		finally
		{
			System.out.println("finally block executed");
			sc.close();
		}
		System.out.println(30);
	}
	void meth2() throws Exception
	{
		System.out.println("meth2() called");
		try(FileReader fr=new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\java\\Nit\\file1.txt"))
				{
					System.out.println("connection created");
				}
	}
	public static void main(String[] args) throws Exception
	{
		Exception_Handling_Class aobj=new Exception_Handling_Class();
		aobj.meth1();
		//aobj.meth2();
	}
}
