package pack5;
//final concwpt
public final class final_concept_Class
{
	final int i=10;//final variable are constant
	final void meth1() //final methods are can't be override but we can inherit 
	{
		System.out.println("Final meth1() called");
		//System.out.println(i++);//C.E 
	}
	public final static void Main (String[] args) 
	{
		final_concept_Class aobj = new final_concept_Class();
		System.out.println("main() method executed");
		aobj.meth1();
	}
}
