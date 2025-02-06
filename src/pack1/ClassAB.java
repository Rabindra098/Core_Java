package pack1;

public class ClassAB 
{
	public static void main(String[] args) 
	{
		ClassAB aobj1 = new ClassAB();
		ClassAB aobj2 = new ClassAB();
		System.out.println("aobj1 :"+aobj1.hashCode());
		System.out.println("aobj2 :"+aobj2.hashCode()+"\n");
		System.out.println(aobj1.equals(aobj2));
		System.out.println(aobj1.equals(aobj1));
		System.out.println(aobj2.equals(aobj1));
		System.out.println(aobj1.equals(new ClassAB()));
		System.out.println(new ClassAB().equals(new ClassAB()));
	}
}
