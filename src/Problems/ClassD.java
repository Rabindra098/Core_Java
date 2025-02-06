package Problems;

import java.util.Scanner;

/*
 * Write a program in java to input number of days. Find and display number of years, 
 * months and days.
 */
public class ClassD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of day : ");
		int total_days=sc.nextInt();
		
		int year=total_days/356;
		int remaining_days_of_year=total_days % 365;
		int month=remaining_days_of_year/30;
		int day=remaining_days_of_year%30;
		System.out.println("Number of Year is : "+year);
		System.out.println("Number Of Month is : "+month);
		System.out.println("Days is : "+day);
			
	}
}
