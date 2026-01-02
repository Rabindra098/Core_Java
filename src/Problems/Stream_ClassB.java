package Problems;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
  Write a Java program that uses the Stream.of method to create a stream of strings,
  filters out the empty strings, and then concatenate the remaining strings into 
  a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!


*/
public class Stream_ClassB 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList and Retriving the data ");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add(" ");
		al.add("World");
		al.add(" ");
		al.add("from");
		al.add(" ");
		al.add("Java");
		al.add("!");
		System.out.println("Before : "+al);
		System.out.println("After : "+al.stream().filter(data->!data.trim().isEmpty()).collect(Collectors.joining(" ")));
		
		System.out.println("\nImplementing Stream and Retriving the data");
		String result = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!")
                .filter(s -> !s.trim().isEmpty()) 
                .collect(Collectors.joining(" "));
		System.out.println(result);
		
		
	}
	public static void main(String[] args) 
	{
		new Stream_ClassB().meth1();
	}
}
