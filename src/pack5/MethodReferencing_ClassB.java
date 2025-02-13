package pack5;

import java.util.ArrayList;
import java.util.TreeSet;

public class MethodReferencing_ClassB 
{
	void show()
	{
		System.out.println("I am from MethodReferencing_ClassB");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(500);
		al.add(70);
		al.add(30);
		al.add(40);
		al.add(10);
		
		System.out.println("Before :"+al);
		System.out.println("After : "+new TreeSet<Integer>(al));
	}
	static void msg()
	{
		System.out.println("This is static method referencing");
	}
	MethodReferencing_ClassB()
	{
		System.out.println("This is constructor referencing");
	}
	MethodReferencing_ClassB(String s)
	{
		System.out.println("This is parameter constructor referencing");
	}
}
