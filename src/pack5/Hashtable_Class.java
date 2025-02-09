package pack5;

import java.util.Hashtable;

public class Hashtable_Class 
{
	void meth1()
	{
		System.out.println("Implementing Hashtable");
		Hashtable<Object, Object> ht = new Hashtable<Object,Object>();
		ht.put(100, "Java");	//Insertion Order is not maintained 
		ht.put("Java", "Java");	//Heterogenious keys are not allowed but Heterogenious values are not allowed but 
//		ht.put(null, null);		//Null key & values are not allowed
		ht.put(1000, "php");     //duplicate values are not allowed
		ht.put('A', "Oracle");	//It is avaleable from Java 1.2v
		ht.put(101, "Spring");	//Its default capacity is 16
		ht.put(true, "HTML");	//It is increased by double
		ht.put(199, "AWS");		//It is sychronized
		ht.put(389, 287);
		ht.put(107, "DevOps");		
		
		System.out.println("Hashtable : "+ht);
	}
	public static void main(String[] args) 
	{
		new Hashtable_Class().meth1();
	}
}
