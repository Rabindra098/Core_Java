package pack2;

public class ClassD 
{
	public  ClassD() 
	{
		System.out.println("Sunday");
		ClassD obj = new ClassD(10);
		System.out.println("Tuesday");
		String s=obj.display("Challange accept");
		System.out.println(s);
	}
	public  ClassD(int temp) 
	{
		System.out.println("Saturday");
		ClassD aobj = new ClassD(10,20);
		int a=aobj.meth1()+temp;
		System.out.println("===>"+(a+aobj.meth2()));
		System.out.println("Monday");
	}
	String display(String s)
	{
		System.out.println("In the next statement I am returning String value");
		return s;
	}
	public  ClassD(int data,int temp) 
	{	
		System.out.println("Thursday");
		System.out.println("====>"+(data+new ClassD("Hi").meth2()-temp));
	}
	ClassD(String s)
	{
		System.out.println(s);
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public static void main(String[] args) 
	{
		ClassD obj = new ClassD();
		System.out.println("Output verified");
	}
}
