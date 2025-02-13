package pack5;
//Clone main method
public class Clone_method_ClassC 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Implimenting object cloning");
		
		Clone_method_ClassA aobj1 = new Clone_method_ClassA();
		System.out.println("aobj1 : "+aobj1.a+" "+aobj1.b);
		
		Clone_method_ClassA aobj2=aobj1;
		aobj2.b=1000;
		System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);
		
		Clone_method_ClassB bobj1 = new Clone_method_ClassB();
		System.out.println("bobj1 : "+bobj1.x+" "+bobj1.y);
		Clone_method_ClassB bobj2=bobj1.createClone();
		bobj2.y=2000;
		System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.y);
		System.out.println(bobj2.y);
	}
}
