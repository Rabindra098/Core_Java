 package pack2;

public class ClassAD 
{
	int x=10;
	static int y=20;
	void meth1()
	{
		System.out.println("\nmeth1() called");
		//increment and decrement operators
		int x=10;
		int y=20;
		++x;	//pre-increment/decrement
		--y;
		System.out.println("value of x :"+x);
		System.out.println("Value of y :"+y);
		x++;	//post-increment/decrement
		y--;
		System.out.println("value of x :"+x);
		System.out.println("Value of y :"+y+"\n");
		//Arithematic operators
		System.out.println("Arithematic operators");
		System.out.println("Addition :"+(x+y));
		System.out.println("Substraction :"+(x-y));
		System.out.println("Multiplication :"+(x*y));
		System.out.println("Divission :"+(x/y));
		System.out.println("Reminder :"+(x%y));
		//logical operators
		System.out.println("\nlogical operators");
		if ((x>0)&&(y<40)) 
		{
			System.out.println("LogicAnd");
		}
		else 
		{
			System.out.println("not a LogicAnd");
		}
		if ((x>0)||(y>40)) 
		{
			System.out.println("LogicOr");
		}
		else 
		{
			System.out.println("not a LogicOr");
		}
		if (!(x>0)) 
		{
			System.out.println("not a LogicNot X");
		}
		else 
		{
			System.out.println("LogicNot X");
		}
		if (!(y<40)) 
		{
			System.out.println("not a LogicNot Y");
		}
		else 
		{
			System.out.println("LogicNot Y");
		}
	}
	int meth2(int x,String s,char c)
	{
		System.out.println("\nmeth2() called");
		System.out.println("value of x :"+x);
		System.out.println("value of s :"+s);
		System.out.println("value of c :"+c);
		new ClassAD(10,15).meth2(10, "hyy", 'A');
		return x=10;
	}
	ClassAD()
	{
		System.out.println("\ndefault constructer called\n");
		
	}
	ClassAD(int a,int b)
	{
		System.out.println("\nParameterized consstructer called");
		//Relation operators
		System.out.println("Relation operators");
		if (a==b)
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not-equal");
		}
		if (a!=b)
		{
			System.out.println("not-equal");
		}
		else 
		{
			System.out.println("equal");
		}
		if (a>b)
		{
			System.out.println("Greaterthan");
		}
		else 
		{
			System.out.println("Smalerthan");
		}
		if (a<b)
		{
			System.out.println("Greaterthan");
		}
		else 
		{
			System.out.println("Smalerthan");
		}
		if (a>=b)
		{
			System.out.println("GreaterthanEqualto");
		}
		else 
		{
			System.out.println("SmalerthanEqualto");
		}
		if (a<=b)
		{
			System.out.println("GreaterthanEqualto");
		}
		else 
		{
			System.out.println("SmalerthanEqualto");
		}
	}
	
	static void meth3()
	{
		int x=10;
		System.out.println("\nstatic method called");
		System.out.println("static variable 1st way:"+y); //1st way
		System.out.println("static variable 2nd way:"+new ClassAD().y);//2nd way
		System.out.println("static variable 3rd way:"+ClassAD.y); //3rd way
		System.out.println("instance variable 1st way:"+new ClassAD().x);
		System.out.println("local variable :"+x);
	}
	final static int d;
	static
	{
		d=100;
		System.out.println("static block executed");
		System.out.println("value of d :"+d);
	}
	void meth4() 
	{
		System.out.println("\nmeth4() called");
		System.out.println("implicit typecasting executed");
		byte b1=100;
		int i1=b1;
		char c='A';
		int i2=c;
		System.out.println("value of b :"+b1);
		System.out.println("value of i1 :"+i1);
		System.out.println("value of c :"+c);
		System.out.println("value of i2 :"+i2);
		System.out.println("\nexplicit typecasting execueted");
		double d=100.89;
		float f=(float)d;
		int i3=300;
		byte b2=(byte)i3;
		System.out.println("value of d :"+d);
		System.out.println("value of f :"+f);
		System.out.println("value of i3 :"+i3);
		System.out.println("value of b2 :"+b2);
		new ClassAD().meth5();
	}
	void meth5()
	{
		System.out.println("meth5() called");
		System.out.println("perferming Auto-boxing");
		int i=100;
		Integer ival1=i;	//1st way
		Integer ival2=new Integer(i);	//2nd way
		Integer ival3=Integer.valueOf(i);
		System.out.println("ival 1 :"+ival1);
		System.out.println("ival 2 :"+ival2);
		System.out.println("ival 3 :"+ival3);
		System.out.println("\nperferming Auto-unboxing");
		Character cval=new Character('A');
		Character c1=cval;	//1st way
		Character c2=cval.charValue(); //2nd way
		System.out.println("cval :"+cval);
		System.out.println("c1 :"+c1);
		System.out.println("c2 :"+c2);
	}
	public static void main(String[] args) 
	{
		ClassAD aobj = new ClassAD();
		System.out.println(aobj.hashCode());
		System.out.println(aobj.equals(new ClassAD()));
		System.out.println(aobj.getClass());
		System.out.println(aobj.toString());
		System.gc();
		aobj.meth1();
		meth3();
		new ClassAD().meth4();
	}
}
