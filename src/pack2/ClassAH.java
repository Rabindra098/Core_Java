package pack2;
/*
3)	A shop will give discount of 10% if the "cost" of purchased quantity is equal to (or) more
	than 1000.Take a Parameterized method which gives the quantity(units) Suppose, one unit will 
	cost 100. Judge and print total cost for user.
*/
public class ClassAH 
{
	void billing(int unit)
	{
		int final_bill=unit*100;
		if (final_bill>=1000) 
		{
			int discount=(10/100)*final_bill;
			System.out.println("Your Total bill :"+(final_bill-discount));
			System.out.println("congratulations !!! you saved "+discount+" discount");
			System.out.println("Thank you visit again");
		}
		else 
		{
			System.out.println("Your Total bill is :"+final_bill);
			System.out.println("purchase more "+(1000-final_bill));
			System.out.println("To recive a discount of 10% in the total bill");
		}
	}
	public static void main(String[] args) 
	{
		ClassAH aobj = new ClassAH();
		aobj.billing(9);
	}
}
