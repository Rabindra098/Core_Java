package pack5;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassAG 
{
	public void meth1()
	{
		System.out.println("Passing user defined Class object into ArrayList");
		ArrayList<ClassAF> al=new ArrayList<ClassAF>();
		al.add(new ClassAF("Rabi",20000,"Java"));
		al.add(new ClassAF("Raju",30000,"Oracle"));
		al.add(new ClassAF("Jatin",40000,"Python"));
		al.add(new ClassAF("Subham",50000,"Spring"));
		
		System.out.println("al : "+al);
		System.out.println("\nRetriving the data by using Irerate loop\n");
		Iterator<ClassAF> i=al.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		new ClassAG().meth1();
	}
}
