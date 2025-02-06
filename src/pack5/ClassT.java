package pack5;
//Clone main method
public class ClassT 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Implimenting object cloning");
		
		ClassR aobj1 = new ClassR();
		System.out.println("aobj1 : "+aobj1.a+" "+aobj1.b);
		
		ClassR aobj2=aobj1;
		aobj2.b=1000;
		System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);
		
		ClassS bobj1 = new ClassS();
		System.out.println("bobj1 : "+bobj1.x+" "+bobj1.y);
		ClassS bobj2=bobj1.createClone();
		bobj2.y=2000;
		System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.y);
		System.out.println(bobj2.y);
	}
}
