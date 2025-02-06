package Problems;

import java.util.Scanner;

/*
 * Write a program to input the basic salary of a person. He gets 15% of the basic as HRA,
 *  15% of the basic as Conveyance allowance and 10% of the basic as Entertainment 
 *  allowance. The total salary is calculated by adding Basic + HRA + Conveyance + 
 *  Entertainment Allowance. Calculate and print the total salary of person.
	Take the Basic Salary from Command Line Argument
 */

public class Calculate_Salary 
{
	public static void main(String[] args) 
	{
		 if (args.length != 1) 
		 {
	            System.out.println("Usage: java SalaryCalculator <BasicSalary>");
	            return;
		 }
	        
	     try 
	     {
	            double basicSalary = Double.parseDouble(args[0]);
	            double hra = 0.15 * basicSalary;
	            double conveyanceAllowance = 0.15 * basicSalary;
	            double entertainmentAllowance = 0.10 * basicSalary;
	            double totalSalary = basicSalary + hra + conveyanceAllowance + entertainmentAllowance;
	            
	            System.out.println("Total Salary: " + totalSalary);
	     } 
	     catch (NumberFormatException e) 
	     {
	            System.out.println("Please enter a valid number for Basic Salary.");
	     }
	
	}
}
