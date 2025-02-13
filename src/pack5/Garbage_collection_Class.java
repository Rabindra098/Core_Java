package pack5;
//Garbage collector

public class Garbage_collection_Class 
{
	void meth1()
	{
		System.out.println("meth1() called");
		Garbage_collection_Class obj = new Garbage_collection_Class();
	}
	@Override
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) 
	{
		Garbage_collection_Class aobj1 = new Garbage_collection_Class();//1st object 
		Garbage_collection_Class aobj2 = new Garbage_collection_Class();//2nd object
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
