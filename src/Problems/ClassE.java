package Problems;
/*
 * A whole-seller gives incentives in the form of discounts on the net bill. 
 * Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000								5
	>=5000 and <10000					10
	>=10000								15

Display Discount %, Discount Amount and Amount Payable
 */

import java.util.Scanner;

public class ClassE 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Bill amount is : ");
		double amount=sc.nextDouble();
		
		if ((amount>=5000)&&(amount<10000)) 
		{
			double discount_amt1=((amount*10)/100);
			System.out.println("Congragulation You  get 10% discount");
			System.out.println("Your Discount Amount is :"+discount_amt1);
			System.out.println("you Can payable amount is : "+(amount-discount_amt1));
		}
		else if (amount>=10000) 
		{
			double discount_amt2=((amount*15)/100);
			System.out.println("Congragulation You  get 15% discount");
			System.out.println("Your Discount Amount is :"+discount_amt2);
			System.out.println("you Can payable amount is : "+(amount-discount_amt2));
		}
		else 
		{
			double discount_amt3=((amount*5)/100);
			System.out.println("Congragulation You  get 5% discount");
			System.out.println("Your Discount Amount is :"+discount_amt3);
			System.out.println("you Can payable amount is : "+(amount-discount_amt3));
		}
	}
}
