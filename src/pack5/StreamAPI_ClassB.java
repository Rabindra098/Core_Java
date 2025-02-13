package pack5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI_ClassB 
{
	void meth1()
	{
		System.out.println("Implementing Stream API ");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rabindra");
		al.add("Jatin");
		al.add("Rajib");
		al.add("Laxmidhar");
		al.add("subham");
		System.out.println("Before :"+al);
		
		/*
		Stream<String> s1=al.stream();
		Stream<String> s2=s1.filter(data->data.length()<=6);	//1st Way
		long l1=s2.count();
		System.out.println("\nThere are "+l+" elements are present whose length is <=6");
		*/
		
//		long l2=al.stream().filter(data->data.length()<=6).count();	//2st Way
//		System.out.println("\nThere are "+l2+" elements are present whose length is <=6");
		
		System.out.println("\nThere are "+al.stream().filter(data->data.length()<=6).count()+" elements are present whose length is <=6"); //3st Way
	}
	public static void main(String[] args) 
	{
		new StreamAPI_ClassB().meth1();
		
	}
}
