package pack2;

public class ClassB 
{
	int x=10;	//Instance or Global or Non-static Variable
	static int y=20;	//Static or Class Variable
	
	boolean flag;
	static float f;
	
	//static int x;
	//String y;				we can't have same name for instance and static variable
	//static double f;
	//char flag;
	void meth1()
	{
		int z=30;	//Local variable
		System.out.println("meth1() called");
		System.out.println("\nInstance variable :"+x);	//by using identifier name
		System.out.println("Instance variable :"+new ClassB().x);//by using Class object name
		
		System.out.println("\nstatic variable :"+y);	//by using identifier name
		System.out.println("static variable :"+new ClassB().y);//by using Class object name
		System.out.println("static variable :"+ClassB.y);//by using Class name
		
		System.out.println("\nLocal variable :"+z);	//by using identifier name
	}
	void meth2()
	{
		System.out.println("\nmeth2() called");
		int x=111;
		int y=222;
		System.out.println("Instance variable :"+new ClassB().x);
		
		System.out.println("\nstatic variable :"+ClassB.y);
		
		//System.out.println("\nLocal variable :"+z);  //C.E
		System.out.println("\nLocal variable x:"+(x+y));
	}
	void meth3()
	{
		System.out.println("\nmeth3() called");
		int num;
		System.out.println("Instance variable falg:"+flag);
		System.out.println("\nstatic variable f:"+f);
		//System.out.println("\nLocal variable num:"+num); //C.E
	}
	public static void main(String[] args) 
	{
		ClassB aobj = new ClassB();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
	}
}
