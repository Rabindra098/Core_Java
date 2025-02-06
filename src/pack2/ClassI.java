package pack2;

public class ClassI 
{
	void meth1()
	{
		int a=34;
		int b=21;
		int c=a++ + ++b; //c=34+23=57 a=35 b=22
		int d=--a + --b + c--;//d=34+21+57=112 a=34 b=21 c=56
		int e=a + +b + +c + d--;//e=34+21+56+112=223 a=34 b=21 c=56 d=111
		int f=-a + b-- + -c - d++;//f=-34+21-56-111= -180 a=34 b=20 c=56 d=112 f=-180
		int sum=a + b + c + d + e + f; 
		System.out.println("sum ="+sum);
	}
	public static void main(String[] args) 
	{
		new ClassI().meth1();
	}
}
