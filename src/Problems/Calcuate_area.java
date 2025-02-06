package Problems;

import java.util.Scanner;

/*
 * Write a java program to calculate the curved surface area of a cube?
 	Formula-6*side Square.
 */
public class Calcuate_area 
{
	Scanner sc = new Scanner(System.in);
	void For_cube()
	{
		System.out.print("Enter Cube side length : ");
		int cube_side_length=sc.nextInt();
		System.out.println("The curved surface area of cube is :"+(6*cube_side_length));
	}
	void For_cylinder()
	{
		System.out.print("\nEnter radius of the cylinder : ");
		int r=sc.nextInt();
		System.out.print("Enter height of the cylinder : ");
		int h=sc.nextInt();
		double pi=3.14;
		System.out.println("The total surface area of a cylinder : "+((2*pi*r)*(r+h)));
		
	}
	public static void main(String[] args) 
	{
		Calcuate_area ca = new Calcuate_area();
		ca.For_cube();
		ca.For_cylinder();
	}
}
