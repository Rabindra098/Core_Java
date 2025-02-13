package pack5;

import java.util.Scanner;

public class throw_Exception 
{
	static double current_balance=100;
	public static void main(String[] args) 
	{
		Scanner	 sc = new Scanner(System.in);
		System.out.println("Enter amount to Withdrawal");
		int n=sc.nextInt();
		try 
		{	
			if (current_balance<n) 
			{
				throw new MinAccBal("Hava sufficient balance first!!");
			}
			else 
			{
				System.out.println("Please take the money :"+n);
			}
		}
		catch (MinAccBal e) 
		{
			System.out.println("Hi");
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
		}
	}
}
