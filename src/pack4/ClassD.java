package pack4;

public class ClassD extends ClassC
{
	public void meth2()
	{
		System.out.println("Class D method");
	}
	public static void main(String[] args) 
	{
		ClassC cobj1 = new ClassC();	//1st point HAS-A Relation
		cobj1.meth1();
		//cobj.meth2();	//C.E
		
		ClassC cobj2 = new ClassC();	//2nd point
		cobj2.meth1();
		//cobj2.meth2();	//C.E
		
		ClassD dobj1 = new ClassD();	//3rd point IS-A Relation
		dobj1.meth1();
		dobj1.meth2();
		//ClassD dobj2 = new ClassC();	//4th point (Invalid)
	}
}
