package pack2;

public class ClassM 
{
	void meth1(int i)
	{
		System.out.println("meth1() called");
		if (i>=10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		if (i<=10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		if (i==10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		if (i!=10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		if (i>10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		if (i<10) 
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
	}
	void CheckElligibility(String name,int age)
	{
		if (age>=29) 
		{
			System.out.println(name+"you are elligible for merriage ");
		}
		else 
		{
			System.out.println(name+"you need to wait for"+(29-age)+"more year");
		}
	}
	void Examelligibility(String name,int age)
	{
		if (!(age>=21 || age<=35)) 
		{
			System.out.println(name+"you can downlode your hallticket");
		}
		else 
		{
			System.out.println(name+"you are not elligible for exam");
		}
		if ((age>=21 && age<=35)) 
		{
			System.out.println(name+"you can downlode your hallticket");
		}
		else 
		{
			System.out.println(name+"you are not elligible for exam");
		}
		if (!(age>=21 && age<=35)) 
		{
			System.out.println(name+"you can downlode your hallticket");
		}
		else 
		{
			System.out.println(name+"you are not elligible for exam");
		}
		if (age>=21 || age<=35) 
		{
			System.out.println(name+"you can downlode your hallticket");
		}
		else 
		{
			System.out.println(name+"you are not elligible for exam");
		}
	}
	public static void main(String[] args) 
	{
		ClassM aobj = new ClassM();
		aobj.meth1(5);
		aobj.CheckElligibility("hari ", 36);
		aobj.Examelligibility("kalki ", 100);
	}
}
