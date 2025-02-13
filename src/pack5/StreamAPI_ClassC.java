package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_ClassC 
{
	void meth1()
	{
		System.out.println("Implementing Stream API ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(19);
		al.add(8);
		al.add(10);
		System.out.println("Before : "+al);
		Stream<Integer> s1=al.stream();
		Stream<Integer> s2=s1.map(
				data->
				{
					if (data%2==0) 
					{
						data=data*2;
					}
					return data;
				}
				);
		List<Integer> li=s2.collect(Collectors.toList());
		System.out.println("\nAfter : "+li);
		//In another way
		System.out.println("\nAfter : "+al.stream().map(
				data->
				{
					if (data%2==0) 
					{
						data=data*2;
					}
					return data;
				}).collect(Collectors.toList())
				);
		System.out.println("\nSorting the data by using stream API");
		System.out.println("\nAfter sorting :"+al.stream().sorted().collect(Collectors.toList()));
		
		
	}
	public static void main(String[] args) 
	{
		new StreamAPI_ClassC().meth1();
	}
}
