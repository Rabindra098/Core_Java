package pack2;
public class ClassA 
{
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	
	boolean flag;
	void meth1()
	{
		System.out.println("printing the defualt values of Datatypes\n");
		System.out.println("int value i:"+i);
		System.out.println("byte value b:"+b);
		System.out.println("short value s:"+s);
		System.out.println("long value l:"+l);
		System.out.println("float value f:"+f);
		System.out.println("double value d:"+d);
		System.out.println("char value c:"+c);		// /u0000=NPC
		System.out.println("boolean value flag:"+flag); //false
	}
	void meth2()
	{
	System.out.println("meth2 calling");
	int i1=100;
	int i2=50;
	int i3=i1+i2;
	System.out.println("\n i:"+i3);
	
	byte b1=10;	//byte range : -128 to 127
	byte b2=50;
	byte b3=(byte)(b1+b2); //10+50==>60==>int value for compiler
	System.out.println("\n b3:"+b3);
	
	float f=10.9f;
	System.out.println("\n f:"+f);
	
	long l=21474883648l;
	System.out.println("\n l:"+l);
	
	double d=19867.98d;
	System.out.println("\n d:"+d);
	
	short s=2627;
	System.out.println("\n s:"+s);
	
	char c='J';
	System.out.println("\n c:"+c);
	
	boolean h=flag;
	System.out.println("\n flag:"+h);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassA aobj = new ClassA();
		aobj.meth1();
		aobj.meth2();
		System.out.println("\nEnd");
	}
}
/* 
  Every number of java by default considered as int and every decimal values is by defaults considered by double.
*/

