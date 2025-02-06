package pack1;

public class ClassAC 
{
	int meth1(int a)	//main() a=20
	{
		System.out.println(a*a);
		new ClassAC().meth2(59,"java");	 //creating an object calling the meth2()
		return a+a+1;
	}
	String meth2(int a,String s)	//meth1() a=59,s=java
	{
		System.out.println(a);
		System.out.println(s);
		new ClassAC().meth3(76, "hyy",'h');	//creating an object calling the meth3()
		return "java";
	}
	int meth3(int b,String s,char c)	//meth2() b=76,s=hyy,c=h
	{
		System.out.println(b+b);
		System.out.println(s);
		System.out.println(c);
		new ClassAC().meth4(65,87,"hello",'j');	//creating an object calling the meth4()
		return 'c';
	}
	String meth4(int d,int f,String s,char c)	//meth3() d=65,f=87,s=hello,c=j
	{
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);
		return "Java is awesome!!!";
	}
	public static void main(String[] args) 
	{
		ClassAC aobj = new ClassAC();	//creating an object
		System.out.println("Start");
		int result=aobj.meth1(20);	//calling the meth1()
		System.out.println("End");
	}
}
