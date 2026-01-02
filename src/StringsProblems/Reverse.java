package StringsProblems;

import java.util.Scanner;

public class Reverse 
{
	void meth1()
	{
		Scanner	 sc = new Scanner(System.in);
		System.out.println("\nEnter a string : ");
		String str=sc.nextLine();
		System.out.println("Retrive the data in reverse order by using StringBuilder ");
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		sc.close();
	}
	public static void main(String[] args) 
	{
		Scanner	 sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		System.out.println("Retrive the data in reverse order by using for loop ");
		for (int i = str.length()-1; i >= 0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		Reverse obj = new Reverse();
		obj.meth1();
		sc.close();
	}
}
