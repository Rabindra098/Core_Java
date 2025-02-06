package Problems;
/*
 * Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 
 * in coloring and added new accessories worth Rs. 500. Rohan wants to make a profit 
 * of Rs. 1500 on selling the cycle. Find the selling price of the cycle. Write a 
 * java program to store all values and calculate and display the selling price.
 */

public class ClassB 
{
	public static void main(String[] args) 
	{
		int Old_Cy_pri=1200;
		int repair=250;
		int coloring=350;
		int add_new_acc=500;
		int want_profit=1500;
		System.out.println("Seling price of the cycle is : "+(Old_Cy_pri+repair+coloring+add_new_acc+want_profit));
	}
}
