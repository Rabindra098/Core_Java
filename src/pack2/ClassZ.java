package pack2;

public class ClassZ 
{
	static int a=0;
	int b=0;
	ClassZ()
	{
		a++;	
		b++;
		System.out.println("Static Variable :"+a);	
		System.out.println("Instance Variable:"+b);	
		System.out.println("----------------------");
	}
	void display()
	{
		System.out.println("*******Accessing Static variable*******");
		System.out.println(ClassZ.a);
		System.out.println(a);
		System.out.println(new ClassZ().a);
	}
	public static void main(String[] args) 
	{
		new ClassZ();
		new ClassZ();
		new ClassZ();
		System.out.println("#####################");
		new ClassZ().display();
	}
}
/*	output
 	Static Variable :1
 	Instance Variable:1
 	-------------------
 	Static Variable :2
 	Instance Variable:1
 	-------------------
 	Static Variable :3
 	Instance Variable:1
 	-------------------
 	###################
 	Static Variable :4
 	Instance Variable:1
 	-------------------
 	******Accessing Static variable******
 	4
 	4
 	Static Variable :5
 	Instance Variable:1
 	-------------------
 	5
*/