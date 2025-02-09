package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable_Class 
{
	void meth1()
	{
		System.out.println("Shorting data in user defined Class object");
		ArrayList<Employee_2nd_Class> al = new ArrayList<Employee_2nd_Class>();
		Employee_2nd_Class emp1=new Employee_2nd_Class("Rabi", 50000, "Java");
		Employee_2nd_Class emp2=new Employee_2nd_Class("Kamal", 40000, "Spring");
		Employee_2nd_Class emp3=new Employee_2nd_Class("Lucky", 20000, "AWS");
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		Iterator<Employee_2nd_Class> i1=al.iterator();
		while (i1.hasNext()) 
		{
			System.out.println(i1.next()); 
		}
		System.out.println("----------------");
		Collections.sort(al);
		Iterator<Employee_2nd_Class> i2=al.iterator();
		while (i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
	}
	public static void main(String[] args) 
	{
		new Comparable_Class().meth1();
	}
}
