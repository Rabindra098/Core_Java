package pack5;

public class Lambda_Expressions_ClassA 
{
	void display() 
	{
		System.out.println("Implementing Lambda Expressions");
		
		InterfaceA x=()->System.out.println("Hello World");
		x.meth1();
		
		InterfaceB y=(int num1,int num2)->System.out.println("Addition : "+(num1+num2));
		y.meth2(30, 50);
		
		InterfaceC z=(int num3,int num4)->
				{
					if (num3<=10) 
					{
						System.out.println("If block executed");
						return num3+100;
					} 
					else 
					{
						System.out.println("Else block executed");
						return num4+1000;
					}
				};
				z.meth3(3, 100);
		
	}
	public static void main(String[] args) 
	{
		new Lambda_Expressions_ClassA().display();
	}
}
