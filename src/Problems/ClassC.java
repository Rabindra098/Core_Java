package Problems;

import java.util.Scanner;

/*
 * Write a program to enter Principal, Rate and Time. Calculate and display 
 * Simple Interest and Amount.
 */

public class ClassC 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal Amount : ");
		double Principal_amt=sc.nextDouble();
		
		System.out.println("Enter the Rate of Intreast : ");
		double rate=sc.nextDouble();
		
		System.out.println("Enter the Time Duration in year : ");
		double time=sc.nextDouble();//year
		double simple_intreast=((Principal_amt*time*rate)/100);
		System.out.println("Simple Intreast is : "+simple_intreast);
		System.out.println("Total amount is : "+(Principal_amt+simple_intreast));
	}
}
