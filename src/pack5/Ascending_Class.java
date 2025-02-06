package pack5;

import java.util.TreeSet;

public class Ascending_Class 
{
	void meth1()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(30);
		ts.add(20);
		ts.add(25);
		System.out.println("Retriving the data by TreeSet In ascending order : "+ts);
		System.out.println("Retriving the data by using for each loop");
		for(Object o:ts)
			System.out.print(o+" ");
	}
	public static void main(String[] args) 
	{
		new Ascending_Class().meth1();
	}
}