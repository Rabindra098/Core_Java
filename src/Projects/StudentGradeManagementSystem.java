package Projects;

import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeManagementSystem 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("Welcome to the Student Grade Management System !");
		//int size = Integer.parseInt(sc.nextLine());
		//String names[]=new String[size];
		System.out.print("Enter the number of student :");
		int No_of_Students=sc.nextInt();
		double grades[]=new double[No_of_Students];
		for (int i = 0; i < No_of_Students; i++) 
		{
			System.out.print("Enter the grade for student :");
			grades[i]=sc.nextDouble();
		}
		boolean running=true;
		while (running) 
		{
			System.out.println("\nmenu");
			System.out.println("1. View all grades");
			System.out.println("2. View the average grade");
	        System.out.println("3. View the highest grade");
	        System.out.println("4. View the lowest grade");
	        System.out.println("5. Exit");
	        System.out.print("Enter your choice: ");
	        
	        int choice=sc.nextInt();
	        switch (choice) 
	        {
				case 1: 
				{
					System.out.println("Grades :");
					for (double grade : grades)
					{
						System.out.println(grade);
					}
					break;
				}
				case 2:
				{	
	                double sum = 0;
	                for (double grade : grades) 
	                {
	                    sum += grade;
	                }
	                double average = sum / No_of_Students;
	                System.out.printf("Average grade: %.2f%n", average);
	                break;
				}
				case 3:
				{	 
	                 double highest = grades[0];
	                 for (double grade : grades) 
	                 {
	                     if (grade > highest) 
	                     {
	                         highest = grade;
	                     }
	                 }
	                 System.out.println("Highest grade: " + highest);
	                 break;
				}
				case 4:
				{
	                double lowest = grades[0];
	                for (double grade : grades) 
	                {
	                    if (grade < lowest) 
	                    {
	                        lowest = grade;
	                    }
	                }
	                System.out.println("Lowest grade: " + lowest);
	                break;
				}
				case 5:
				{
	                System.out.println("Exiting the program. Goodbye!");
	                running = false;
	                break;
				}
				default:
				{
					 System.out.println("Invalid choice! Please try again.");
	                 break;
				}
	        }
		}
	}
	public static void main(String[] args) 
	{
		new StudentGradeManagementSystem().meth1();
	}
}