package pack2;

public class ClassCP 
{
	String s1="Java";
	StringBuffer buffer1=new StringBuffer("Java");
	StringBuilder builder1=new StringBuilder("Java");
	void meth1()
	{
		System.out.println("meth1() called");
		
		
		System.out.println("-------before-------");
		System.out.println("s1 :"+s1);
		System.out.println("buffer1 :"+buffer1);
		System.out.println("builder1 :"+builder1);
		
		s1.concat(" is awesome!!");
		buffer1.append(" is awesome!!");
		builder1.append(" is awesome!!");
		
		System.out.println("-------after-------");
		System.out.println("\ns1 :"+s1);
		System.out.println("buffer1 :"+buffer1);
		System.out.println("builder1 :"+builder1);
	}
	void meth2()
	{
		System.out.println("\nmeth2() called");
		
		String s2=new String("Java");
		StringBuffer buffer2=new StringBuffer("Java");
		StringBuilder builder2= new StringBuilder("Java");
		
		System.out.println("\n"+s1.equals(s2));
		System.out.println(buffer1.equals(buffer2));
		System.out.println(builder1.equals(builder2));
		
		System.out.println("\n");
		System.out.println(s1==s2);
		System.out.println(buffer1==buffer2);
		System.out.println(builder1==builder2);
		//Comparing the content s present inside the StringBuffer and StringBuilder
		
		System.out.println("\n"+buffer1.toString().equals(buffer2.toString()));
		System.out.println(builder1.toString().equals(builder2.toString()));
		
		builder1.append(" is awesome!!");
		System.out.println(builder1.toString().equals(builder2.toString()));
	}
	void meth3()
	{
		System.out.println("\nmeth3() called");
		StringBuffer sb=new StringBuffer();
		System.out.println("Capacity() :"+sb.capacity());
		StringBuffer sb1=new StringBuffer("abcdefghijklmn ");
		System.out.println("length() :"+sb1.length());
		System.out.println("capacity() :"+sb1.capacity());	//(current capacity+1)*2
		System.out.println("sb1 :"+sb1);
		sb1.reverse();
		System.out.println("sb1 reverse :"+sb1);
	}
	public static void main(String[] args) 
	{
		ClassCP aobj = new ClassCP();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
	}
}
