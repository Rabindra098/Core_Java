package pack5;
//Vector
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Class 
{
	public void meth1() 
	{
		System.out.println("Implementing vector");
		Vector<Object> v = new Vector<Object>();
		v.add(100);	//Insertion order is maintained
		v.add("Java");	//heterogeneous data is allowed
		v.add(null);	//null are allowed 
		v.add(10);	//duplicate values are allowed
		v.add('A');	//It is available for java 1.0 [It is a LEGACY Class]
		v.add(true);	//Its default capacity is 10.
		v.add(66);	//Its size is increases by double
		v.add(1);	//It is synchronized
		
		System.out.println("\nVector : "+v);
		System.out.println("Capacity() : "+v.capacity());
		System.out.println("size() : "+v.size());
		v.add(3,100);
		v.set(6, false);
		v.add(500);
		v.add(v.size()-1);
		System.out.println("\nVector : "+v);	
		System.out.println("Capacity() : "+v.capacity());//Capacity is increased by double
		System.out.println("size() : "+v.size());
		System.out.println("\nRetriving the data by using for loop in forword direction");
		for(int i=0;i<=v.size()-1;i++)
			System.out.print(v.get(i)+" ");
		System.out.println("\n\nRetriving the data by using for loop in backword direction");
		for(int i=v.size()-1;i>=0;i--)
			System.out.print(v.get(i)+" ");
		System.out.println("\n\nRetriving the data by using for-each");
		for(Object o:v)
			System.out.print(o+" ");
		System.out.println("\n\nRetriving the data by using Enumration Interface");
		Enumeration<Object> e=v.elements();
		while (e.hasMoreElements()) 
		{
			System.out.print(e.nextElement()+" ");
		}
		
		System.out.println("\n\nRetriving the data by using Iterator Interface");
		Iterator<Object> I=v.iterator();
		while (I.hasNext()) 
		{
			System.out.print(I.next()+" ");
		}
		
		ArrayList<Object> al = new ArrayList<Object>(v);	//1st Way
//		al.add(v);	//2st Way
		/*for(Object o:v)	//3st Way
			al.add(v);*/
		/*for(int i=0;i<=v.size()-1;i++)	//4 st Way
			al.add(v);*/
		System.out.println("\n\nVector : "+v);
		System.out.println("ArrayList :"+al);	
	}
	void meth2()
	{
		System.out.println("\nPassing user defined class object into the Vector\n");
		Vector<Object> v = new Vector<Object>();
		v.add(new Employee("Rabi", 50000, "Java"));
		v.add(new Employee("NitiN", 60000, "Python"));
		v.add(new Employee("Itamati", 50000, "Spring"));
		Enumeration<Object> e=v.elements();
		while (e.hasMoreElements()) 
		{
			//System.out.println(e.nextElement());
			Employee emp=(Employee)e.nextElement();
			String s=emp.getString();
			System.out.println(s+"==>"+s.length()+" (Palindrome: "+isPalindrome(s)+")");
		}
	}
	public boolean isPalindrome(String str) 
	{
		str = str.toLowerCase();
		int left = 0, right = str.length() - 1;
		while (left < right) 
		{
			if (str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		//new ClassAI().meth1();
		new Vector_Class().meth2();
	}
}