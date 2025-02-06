package Problems;

import java.util.Scanner;

/*
 * Write a  program in Java that will generate and print the bill at Dominos for 
 * four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 
 * per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. 
 * Calculate and print final bill as well as all item bill.
 */
public class ClassF 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("         *******Welcome to Dominos*******");
		System.out.println("Dominos Menus :  Chicken Rolls");
		System.out.println("                 Vegetable Puffs");
		double chicken_roll=60;
		double veg_puffs=25;
		System.out.print("How many Chicken Rolls You can want : ");
		int rolls=sc.nextInt();
		System.out.print("How many Vegetable Puffs you can want : ");
		int puffs=sc.nextInt();
		System.out.println("No. of Rolls : "+rolls+"  Its price is : "+chicken_roll+"   =  "+(rolls*chicken_roll));
		System.out.println("No. of puffs : "+puffs+"  Its price is : "+veg_puffs+"   =  "+(puffs*veg_puffs));
		double discount=50;
		System.out.println("Dominos given discount price   :        = -"+discount);
		System.out.println("----------------------------------------------");
		System.out.print("Your Total bill price is       :        =  "+((rolls*chicken_roll)+(puffs*veg_puffs)-(discount)));
		
	}
}
