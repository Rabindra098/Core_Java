package pack2;
/*
4)  A school has following rules for grading system:
	a. Below 25 - F
	b. 25 to Below 45 - E
	c. 45 to Below 50 - D
	d. 50 to Below 60 - C
	e. 60 to Below 80 - B
	f. Above 80 - A
Take a parameterized method which takes marks as input  and print the corresponding grade.

 */
public class ClassAJ 
{
	void Cheakgrade(int marks)
	{
		if (marks>=80) 
		{
			System.out.println("You can get A grade");
		}
		else if (marks<80 && marks>=60) 
		{
			System.out.println("You can get B grade");
		}
		else if (marks<60 && marks>=50) 
		{
			System.out.println("You can get C grade");
		}
		else if (marks<50 && marks>=45) 
		{
			System.out.println("You can get D grade");
		}
		else if (marks<45 && marks>=25) 
		{
			System.out.println("You can get E grade");
		}
		else if (marks<25) 
		{
			System.out.println("You can get F grade");
			System.out.println("Performing very poor. work hard");
		}
	}
	public static void main(String[] args) 
	{
		ClassAJ aobj = new ClassAJ();
		aobj.Cheakgrade(79);
	}
}
