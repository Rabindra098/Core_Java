package Problems;
/*
 * A shopkeeper buys a TV set for Rs. 32,500 and sells 
 * it at a profit of 27%. Apart from this a VAT of 
 * 12.7% and Service Charge is 3.87% is charged. 
 * Display total selling price, profit along with 
 * vat and service charge.
 */
public class ClassA 
{
	
	public static void main(String[] args) 
	{
		int TV_price=32000;
		double Profit=TV_price*27/100;
		double VTA=TV_price*12.7/100;
		double Service_charege=TV_price*3.87/100;
		System.out.println("A shopkeeper buy a TV at  Price :"+TV_price);
		System.out.println("Total selling  price of TV:"+(TV_price+Profit+VTA+Service_charege));
	}
}
