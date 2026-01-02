package pack5;

public class Enum_Class 
{
	void meth1()
	{
		System.out.println("Implementing Enum ");
		Days d=Days.friday;
		System.out.println("d : "+d);
		switch (d) 
		{
			case friday: 
			{
			System.out.println("Today is our last session of core Java");
				break;
			}
			case Saturday:
			{
				System.out.println("Today there no class for core Java");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
				break;
			}
		}
		System.out.println("\nRetriving the data by using for-each ");
		Days arr[] = Days.values();
		for (Days data : arr) 
		{
			System.out.println(data+" ");
		}
	}
	public static void main(String[] args) 
	{
		new Enum_Class().meth1();
	}
}
