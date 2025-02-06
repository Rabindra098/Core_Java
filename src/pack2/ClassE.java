package pack2;

public class ClassE 
{
	int calculate(int x)
	{
		System.out.println("inside calculate :"+x);
		return x*3;
	}
	int compute(int a,int b)
	{
		System.out.println("inside compute :"+a+","+b);
		return a+b;
	}
	int process(int m,int n)
	{
		System.out.println("inside process :"+m+","+n);
		return m-n;
	}
	int analyze(int p,int q,int r)
	{
		System.out.println("inside analyze :"+p+","+q+","+r);
		return p*q+r;
	}
	int evaluete(int x)
	{
		System.out.println("inside evaluete :"+x);
		return x/2;
	}
	ClassE()
	{
		System.out.println(10);
	}
	ClassE(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	ClassE(String s,int x)
	{
		System.out.println(s);
		System.out.println((x/2)+100);
	}
	public static void main(String[] args) 
	{
		int result = new ClassE().calculate(new ClassE(new ClassE().evaluete(6),"Hi").compute(10, new ClassE().process(8,4) 
					+ new ClassE("hi",20).analyze(5, 3,new ClassE().evaluete(6)))); 
		System.out.println("Final result :"+result);
	}
}
