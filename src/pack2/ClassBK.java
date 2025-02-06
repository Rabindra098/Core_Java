package pack2;
import java.util.Arrays;
import java.util.Scanner;

public class ClassBK 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println("How many names you want to store ?");
		int size = Integer.parseInt(sc.nextLine());
		String names[]=new String[size];
		//String names[]=new String[sc.nextLine()];
		System.out.println("please enter "+names.length+" names");
		for (int i = 0; i < names.length ; i++) 
		{
			names[i]=sc.next();
		}
		System.out.println("\nElements entered by the user :"+names);
		System.out.println("\nElements entered by the user :"+Arrays.toString(names));
		System.out.println("\nRetriving the data in forward direction by using for loop");
		for (int i = 0; i <= names.length-1; i++) 
		{
			System.out.print(names[i]+" ");
		}
		System.out.println("\nRetriving the data in backward direction by using for loop");
		for (int i = names.length-1; i > 0; i--) 
		{
			System.out.print(names[i]+" ");
		}
		System.out.println("Retriving the data by using for-each loop");
		for (String data : names) 
		{
			System.out.print(data+" ");
		}
	}
	public static void main(String[] args) 
	{
		new ClassBK().meth1();
	}
}
