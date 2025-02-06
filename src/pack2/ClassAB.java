package pack2;

public class ClassAB 
{
	void implicit() 
	{
		System.out.println("Performing implicit typecasting\n");
		byte b1=50;
		int i1=b1;
		System.out.println("byte value b1 :"+b1);
		System.out.println("int value i1 :"+i1+"\n");
		
		char c='A';
		int i2=c;
		double d1=c;
		System.out.println("char value c :"+c);
		System.out.println("int value i2 :"+i2);
		System.out.println("double value d1 :"+d1+"\n");
		
		long l=100l;
		float f=l;
		System.out.println("long value l :"+l);
		System.out.println("float value f :"+f);
	}
	void explicit()
	{
		System.out.println("Performing explicit typecasting\n");
		int i1=100;
		byte b1=(byte)i1;
		System.out.println("int value i1 :"+i1);
		System.out.println("byte value b1 :"+b1+"\n");
		
		int i2=500;
		byte b2=(byte)i2;	//byte range= (-128) to (127)
		System.out.println("int value i2 :"+i2);
		System.out.println("byte value b2 :"+b2+"\n");
		/*
		 	[Minimum Range + (Result - Maximum -1)]
		 	  [-128+(500-127-1)]
		 	=>[-128+(500-128)]
		 	=>[-128+372]
		 	=>244
		 	again 
		 	  [-128+(244-127-1)]
		 	=>[-128+(244-128)]
		 	=>[-128+116]
		 	=>-12
		*/
	}
	void meth1(byte b) 
	{
		float f=10.999f;
		byte b3=(byte)f;
		System.out.println("meth1() called :"+b);
		System.out.println("float value f :"+f);
		System.out.println("byte value b3 :"+b3+"\n");
	}
	public static void main(String[] args) 
	{
		ClassAB aobj = new ClassAB();
		aobj.implicit();
		System.out.println("----------------------------------------");
		aobj.explicit();
		System.out.println("-----------------------------------------");
		aobj.meth1((byte)5);
	}
}
