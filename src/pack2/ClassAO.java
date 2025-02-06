package pack2;

public class ClassAO 
{
	void meth1(String name,char gender,int age)
	{
		System.out.println("Implimenting switch case\n");
		final int i=400;
		//i++; C.E  because vairable are constant
		byte b=30;
		switch (b+35-5) 	//30+35-5===60------>int
		{
		//System.out.println("Hello");
		case 10:
			System.out.println("case 10 executed");
			break;
		case 20:
			System.out.println("case 20 executed");
			break;
		case 'A'-5:
			System.out.println("case 60 executed");
			System.out.println("int and char both compatable datatypes");
			switch (gender) 
			{
			case 'M','m':
				System.out.println("user is male");
				if (age>29) 
				{
					System.out.println(name+"you are elligible");
				}
				else 
				{
					System.out.println(name+" you need to wait for "+(29-age)+" year");
				}
			break;
			case 'F','f':
				System.out.println("user is female");
				if (age>26) 
				{
					System.out.println(name+" you are elligible");
				}
				else 
				{
					System.out.println(name+"you need to wait for "+(29-age)+" year");
				}
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			break;
		case i:
			System.out.println("case 400 executed");
			break;
		case 50:
			System.out.println("case 50 executed");
			break;
		default:
			System.out.println("default case get executed");
			System.out.println("invalid data");
			break;
		}
	}
	public static void main(String[] args) 
	{
		ClassAO aobj = new ClassAO();
		aobj.meth1("rohit", 'm', 29);
	}
}
