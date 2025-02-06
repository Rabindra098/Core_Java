package pack2;
/*
5)	A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. 
	Take a parameterized method which takes users salary and year of service and print the bonus amount & Updated Salaray.
 */
public class ClassAL 
{
	void CalculateBonusSal(double sal,int yr_of_service)
	{
		if (yr_of_service>=5) 
		{
			double bonus=(sal/100)*5;
			double total_sal=sal+bonus;
			System.out.println("Congratulation!!! You can get  bonus amount is "+bonus+" and your Total Salary "+total_sal);
		}
		else 
		{
			System.out.println("Your bonus salary can not be update");
			System.out.println("You can work our company more "+(5-yr_of_service)+" year");
		}
	}
	public static void main(String[] args) 
	{
		new ClassAL().CalculateBonusSal(826, 6);
	}
}
