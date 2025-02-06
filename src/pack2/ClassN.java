package pack2;

public class ClassN 
{
	void meth1()
	{
		int x=7,y=3;
		boolean isEqual = x==y;
		boolean isGreaterThan = x>y;
		boolean isLessThan = x<y;
		boolean isNotEqual = x!=y;
		System.out.println("isEqual :"+isEqual);	//false
		System.out.println("isGreaterThan :"+isGreaterThan);	//true
		System.out.println("isLessThan :"+isLessThan);	//false
		System.out.println("isNotEqual :"+isNotEqual);	//true
	}
	void meth2()
	{
		boolean p=true, q=false;
		boolean logicalAND = p && q;
		boolean logicalOR = p || q;
		boolean logicalNOTp = !p;
		boolean logicalNOTq = !q;
		System.out.println("logicalAND :"+logicalAND);	//false
		System.out.println("logicalOR :"+logicalOR);	//true
		System.out.println("logicalNOT of p :"+logicalNOTp);	//false
		System.out.println("logicalNOT of q :"+logicalNOTq);	//true
	}
	public static void main(String[] args) 
	{
		ClassN aobj = new ClassN();
		aobj.meth1();
		aobj.meth2();
	}
}
