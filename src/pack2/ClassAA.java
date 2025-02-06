package pack2;

public class ClassAA 
{
	int c;
	static int e;
	ClassAA()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) 
	{
		int a=34;	
		int b=21;
		new ClassAA().c=a++ + ++b;	//new ClassAA().c= 34+22=56
		int d=--a + --b + new ClassAA().c--;	//d=34+21+57=112 
		e= a + +b + new ClassAA().c + d--;	//e=34+21+56+112
		int f=-a + b-- + -new ClassAA().c - d++;
		int sum=a + b + new ClassAA().c + d + e + f;
		System.out.println("sum :"+sum);
	}
}
/*
 	output
 	1
 	1
 	1
 	2
 	1
 	3
*/
