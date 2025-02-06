package Problems;

import java.util.Scanner;

/*
 * Write a Java program to check if a given number is a palindrome. 
 * A number is a palindrome if it remains the same when its digits are reversed.
 */
public class ClassG 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number=sc.nextInt();
		if (ispalindrome(number)) 
		{
			System.out.println(number+" is a palindrom ");
		} 
		else 
		{
			System.out.println(number+" is not a palindrom");
		}
		sc.close();
	}
	public static boolean ispalindrome(int number)
	{
		int originalNumber=number;
		int reversedNumber=0;
		while (number!=0) 
		{
			int digit =number%10;	//
			reversedNumber=reversedNumber*10+digit;
			number/=10;
		}
		return originalNumber == reversedNumber;
	}
}
