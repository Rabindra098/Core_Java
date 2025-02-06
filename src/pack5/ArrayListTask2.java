package pack5;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Write a Java program that creates an ArrayList of strings and then prompts the user 
 *  to enter five strings. Add each string entered by the user to the ArrayList. Finally, 
 *  print out the ArrayList to the console.
 */
public class ArrayListTask2 
{
	public void meth1() 
	{
		System.out.println("Passing user defined String data into ArrayList\n");
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five String data : ");
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter String "+i+" :");
			al.add(sc.nextLine());
		}
		System.out.println("al : "+al);
	}
	public static void main(String[] args) 
	{
		new ArrayListTask2().meth1();
	}
}
