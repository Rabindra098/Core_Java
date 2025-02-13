package pack5;

import java.util.ArrayList;

public class Functional_Interface_ClassA 
{
	void display()
	{
		System.out.println("Implementing Lambda Expression");
		Functional_IntrefaceA x=(i,al2)->
		{
			System.out.println("I value :"+i);
			System.out.println("al2 :"+al2);
		};
		ArrayList<Object> input = new ArrayList<Object>();
		input.add(10);
		input.add("java");
		input.add(true);
		input.add('A');
		input.add(null);
		x.meth1(5, input);
	}
	public static void main(String[] args) 
	{
		new Functional_Interface_ClassA().display();	
	}
}
