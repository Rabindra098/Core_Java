package Problems;
/*
Write a Java program that creates a stream of integers using Stream.of, 
filters out the even numbers and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10
 */

import java.util.ArrayList;

public class Stream_ClassA 
{
	void meth1()
	{
		 ArrayList<Integer> al =new	ArrayList<Integer>();
		    al.add(1);
		    al.add(2);
		    al.add(3);
		    al.add(4);
		    al.add(5);
		    al.add(6);
		    al.add(7);
		    al.add(8);
		    al.add(9);
		    al.add(10);
		    System.out.println("Before :"+al);
		    System.out.println("Retriving the data by using forEach method");
		    al.forEach(data->
		    {
		    	if (data%2==0) 
		    	{
//		    		data=data;
		    		data=data*data;
		    		System.out.print(data+" ");
				}
		    }
		    );
	}
	public static void main(String[] args) 
	{
		new Stream_ClassA().meth1();
	}
}
