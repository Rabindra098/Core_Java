package pack5;
//Garbage collector

public class ClassU 
{
	void meth1()
	{
		System.out.println("meth1() called");
		ClassU obj = new ClassU();
	}
	@Override
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) 
	{
		ClassU aobj1 = new ClassU();//1st object 
		ClassU aobj2 = new ClassU();//2nd object
		aobj1.meth1();
		System.out.println("aobj1 :"+aobj1.hashCode());
		System.out.println("aobj2 :"+aobj2.hashCode());
		aobj2=aobj1;
		//aobj1=null;
		System.gc();
		System.out.println("aobj1 :"+aobj1.hashCode());
		System.out.println("aobj2 :"+aobj2.hashCode());
	}
}
