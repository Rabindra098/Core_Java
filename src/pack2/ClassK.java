package pack2;

public class ClassK 
{
	void meth1()
	{
		int x=10;
		System.out.println("before x:"+x);
		x=x++;
		System.out.println("after x:"+x+"\n");
		int y=20;
		System.out.println("before y:"+y);
		int z=y++;
		System.out.println("after y:"+y);
		System.out.println("z value ="+z+"\n");
		int i=50;
		System.out.println("before i:"+i);
		i=i++ + ++i;
		System.out.println("after i:"+i+"\n");
		int k=100;
		System.out.println("before k:"+k);
		k=k++ + 10;
		System.out.println("after k:"+k+"\n");
		int m=100;
		System.out.println("before m:"+m);
		m=++m + 10;
		System.out.println("after m:"+m+"\n");
		System.out.println("sum="+(x+y+z+i+k+m));
	}
	public static void main(String[] args) 
	{
		ClassK aobj = new ClassK();
		aobj.meth1();
	}
}
