package pack5;
/*
 * Write a Java program to create an ArrayList of integers and then add five 
 * numbers to it. After that, print out the ArrayList to the console.
 */
import java.util.ArrayList;

public class ArrayListTask1 
{
	public void meth1() 
	{
		System.out.println("Passing  number into ArrayList\n");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(250);
		al.add(738);
		
		System.out.println("al : "+al);
		
	}
	public static void main(String[] args) 
	{
		new ArrayListTask1().meth1();
	}
}
