package pack2;

public class ClassAE 
{
	void meth1()
	{
		System.out.println("perferminf Auto-boxing");
		int i=100;
		Integer ival1=i;	//1st way
		Integer ival2=new Integer(i);	//2rd way
		Integer  ival3=Integer.valueOf(i);	//3rd way
		System.out.println("int PDT i :"+i);
		System.out.println("int WCO ival1 :"+ival1);
		System.out.println("int WCO ival2 :"+ival2);
		System.out.println("int WCO ival3 :"+ival3+"\n");
		
		char c='A';
		Character cval=Character.valueOf(c);
		System.out.println("char PDT c :"+c);
		System.out.println("Character WCO cval :"+cval+"\n");
		
		boolean flag=true;
		Boolean bval1=new Boolean(flag);
		Boolean bval2=Boolean.valueOf(flag);
		System.out.println("boolean PDT flag :"+flag);
		System.out.println("Boolean WCO bval :"+bval1);
		System.out.println("Boolean WCO bva2 :"+bval2);
	}
	void meth2()
	{
		System.out.println("perferminf Auto-unboxing");
		Byte bval=new Byte((byte)5);
		byte b1=bval;	//1st way
		byte b2=bval.byteValue();	//2nd way
		System.out.println("Byte WCO bval :"+bval);
		System.out.println("byte PDT b1 :"+b1);
		System.out.println("byte PDT b2 :"+b2+"\n");
		
		Character cval = new Character('A');
		char c1=cval.charValue();
		System.out.println("Character WCO cval :"+cval);
		System.out.println("char PDT c1 :"+c1+"\n");
		
		System.out.println("Range of Byte :"+Byte.MAX_VALUE+"to"+Byte.MAX_VALUE);
		System.out.println("Range of Integer :"+Integer.MAX_VALUE+"to"+Integer.MAX_VALUE);
		int R_num=Integer.parseInt(new ClassAE().StudentRollNumber());
		
		System.out.println("R_num :"+R_num);
	}
	String StudentRollNumber()
	{
		return "100";
	}
	public static void main(String[] args) 
	{
		ClassAE aobj = new ClassAE();
		aobj.meth1();
		System.out.println("--------------------------------");
		aobj.meth2();
	}
}
