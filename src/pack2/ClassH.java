package pack2;

public class ClassH 
{
	int meth1()
	{
		int a=10;
		a++;	//10 a=11
		System.out.println(a++);//11 a=12
		a++;//12 a=13
		System.out.println(++a);//14 a=14
		System.out.println(a++);//14 a=15
		System.out.println(a++);//15 a=16
		a--;//16 a=15
		System.out.println(--a);//14 a=14
		a=a++ + 3; //14+3=17
		System.out.println("a value ==> "+a);//17
		System.out.println(a++);//17 a=18
		--a;//17 a=17
		System.out.println(--a);//16 a=16
		System.out.println(a--);//16 a=15
		a=a-- + 3; //a=18
		return a++ + ++a;//a=19+19=38
	}
	void meth2()
	{
		int a=10;//a=10
		int x= new ClassH().meth1();//meth1() called	x=38
		System.out.println(x++ + a++);//38+10=44	x=39 a=11
		System.out.println(a++);//11 a=12
		System.out.println(a);//a=12
		System.out.println(x);//x=39
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		new ClassH().meth2();
		System.out.println("End");
	}
}
