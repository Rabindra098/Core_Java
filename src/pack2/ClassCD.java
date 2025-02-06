package pack2;

public class ClassCD 
{
	void meth1()
	{
		System.out.println("meth1() called\n");
		String s1="Java";
		String s2=new String("Java");
		
		char arr[]= {'J','a','v','a'};
		String s3=new String(arr);
		String s4=new String(arr,1,2);
		
		System.out.println("s1 : "+s1+"("+s1.length()+")");
		System.out.println("s1 : "+s2+"("+s2.length()+")");
		System.out.println("s1 : "+s3+"("+s3.length()+")");
		System.out.println("s1 : "+s4+"("+s4.length()+")");
	}
	void meth2()
	{
		System.out.println("\nmeth2() called\n");
		System.out.println("String which are created by using String class are Immutable\n");
		String s="java";
		System.out.println("Before Concatination s : "+s);
		System.out.println(s.concat(" is awesome!!"));
		s=s.concat(" is awesome!!");
		System.out.println("After Concatination s : "+s);
	}
	public static void main(String[] args) 
	{
		ClassCD aobj = new ClassCD();
		aobj.meth1();
		aobj.meth2();
	}
}
